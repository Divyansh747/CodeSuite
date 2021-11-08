package com.divyansh.online.compiler.Controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.divyansh.online.compiler.Entity.ContestEntity;
import com.divyansh.online.compiler.Entity.ContestQnEntity;
import com.divyansh.online.compiler.Entity.PracticeEntity;
import com.divyansh.online.compiler.Repository.ContestQnRepository;
import com.divyansh.online.compiler.Repository.ContestRepository;
import com.divyansh.online.compiler.Request.ContestQnRequest;
import com.divyansh.online.compiler.Request.ContestRequest;
import com.divyansh.online.compiler.Service.CompileRequest;

@CrossOrigin
@RestController
public class ContestController {
	
	@Autowired
	private CompileRequest compileRequest;
	
	@Autowired
	private ContestRepository contestRepository;

	@Autowired
	private ContestQnRepository contestQnRepository;
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/contest/createContest")
	public ResponseEntity<?> createContest(@ModelAttribute ContestRequest contest) throws IOException, InterruptedException{
		
		LocalDateTime ldt = LocalDateTime.now();
		String timestamp = "" + new Date().getTime();
		String aboutContest = "contest/About/" + contest.getEmail() + "_About-" + timestamp + ".txt";
		
		try {
			compileRequest.uploadAboutContest(contest.getAbout(), aboutContest);
			
		} catch (IOException e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} 
		
		contestRepository.save(new ContestEntity(contest.getEmail(), contest.getTitle(), contest.getStatus(),
				timestamp, aboutContest)); 
		
		return new ResponseEntity("Contest Created Successfully", HttpStatus.OK);
	}

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/contest/createContest")
	public ResponseEntity<?> getAllContest() throws Exception {
		return ResponseEntity.ok(contestRepository.findAll());
	}

	/*@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/contest/{ContestID}")
	public ResponseEntity<?> getContestByID(@PathVariable(value="ContestID") Long ContestID) throws Exception {
		return ResponseEntity.ok(contestRepository.findByContestID(ContestID));
	}*/
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/contest/{ContestID}/createQn")
	public ResponseEntity<?> createContestQn(@PathVariable(value="ContestID") Long ContestID, @ModelAttribute ContestQnRequest contestQn) throws IOException, InterruptedException{
		
		LocalDateTime ldt = LocalDateTime.now();
		String timestamp = "-" + new Date().getTime();
		String qFilename = "contest/Question/" + contestQn.getEmail() + "_Question" + timestamp + ".txt";
		String tcFilename = "contest/TestCase/" + contestQn.getEmail() + "_TestCase" + timestamp + ".txt";
		String tcAnsFilename = "contest/TestCase/" + contestQn.getEmail() + "_TestCaseAns" + timestamp + ".txt";
		
		try {
			compileRequest.savePracticeQuestion(contestQn.getQuestion(), qFilename);
			compileRequest.savePracticeQuestionTestCase(contestQn.getTestcase(), tcFilename);
			compileRequest.savePracticeQuestionTestCaseAnswer(contestQn.getTestcaseAns(), tcAnsFilename);
			
		} catch (IOException e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		contestQnRepository.save(new ContestQnEntity(contestQn.getEmail(), ContestID, contestQn.getTitle(), contestQn.getType(),
				contestQn.getHints(), contestQn.getRelatedTopic(), contestQn.getNoOfTestCase(), qFilename, tcFilename, tcAnsFilename)); 
		
		return new ResponseEntity("Contest Created Successfully", HttpStatus.OK);
	}
}
