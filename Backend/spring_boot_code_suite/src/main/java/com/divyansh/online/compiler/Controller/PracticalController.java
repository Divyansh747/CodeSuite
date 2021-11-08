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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.divyansh.online.compiler.Entity.PracticeEntity;
import com.divyansh.online.compiler.Repository.PracticeRepository;
import com.divyansh.online.compiler.Request.PracticalRequest;
import com.divyansh.online.compiler.Service.CompileRequest;

@CrossOrigin
@RestController
public class PracticalController {


	@Autowired
	private CompileRequest compileRequest;
	
	@Autowired
	private PracticeRepository practiceRepository;
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/practice/createQn")
	public ResponseEntity<?> createQn(@ModelAttribute PracticalRequest practical) throws IOException, InterruptedException{
		
		LocalDateTime ldt = LocalDateTime.now();
		String timestamp = "-" + new Date().getTime();
		String qFilename = "practice/Question/" + practical.getEmail() + "_Question" + timestamp + ".txt";
		String tcFilename = "practice/TestCase/" + practical.getEmail() + "_TestCase" + timestamp + ".txt";
		String tcAnsFilename = "practice/TestCase/" + practical.getEmail() + "_TestCaseAns" + timestamp + ".txt";
		
		try {
			compileRequest.savePracticeQuestion(practical.getQuestion(), qFilename);
			compileRequest.savePracticeQuestionTestCase(practical.getTestcase(), tcFilename);
			compileRequest.savePracticeQuestionTestCaseAnswer(practical.getTestcaseAns(), tcAnsFilename);
			
		} catch (IOException e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		practiceRepository.save(new PracticeEntity(practical.getEmail(), practical.getTitle(), practical.getType(),
				practical.getHints(), practical.getRelatedTopic(), qFilename, tcFilename, tcAnsFilename)); 
		
		return new ResponseEntity("Question created successfully", HttpStatus.OK);
	}
	
	@GetMapping("/practice/createQn")
	public ResponseEntity<?> getAllPracticeQn() throws Exception {
		return ResponseEntity.ok(practiceRepository.findAll());
	}
	
}
