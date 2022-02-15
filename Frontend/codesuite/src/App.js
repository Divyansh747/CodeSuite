import './App.css';
import React , { useState } from 'react'
import ScrollToTop from "./components/ScrollToTop";
import Navbar from './components/Navbar';
import Homemid from './components/Homemid';
import Footer from './components/Footer';
import Compiler from './components/Compiler';
import Courses from './components/Courses';
import Webdev from './components/Webdev';
import Practiceques from './components/Practiceques'
import Createques from './components/Createques'
import Login from './components/Login'
import Logout from './components/Logout'
import Signup from './components/Signup'
import ContestPortal from './components/ContestPortal'
import CreateContest from './components/CreateContest';
import CreateContestQn from './components/CreateContestQn';
import ViewContest from './components/ViewContest';
import ViewContestQn from './components/ViewContestQn';
import ViewPracticeQn from './components/ViewPracticeQn';

import {
  BrowserRouter as Router,
  Routes,
  Route,
  // Link
} from "react-router-dom";


function App() {
  const [Ques , setQues ] = useState('No Questions available'); 

  return (
    <>
    <Router>
    <ScrollToTop />
    <Navbar/>
      <Routes>  
        <Route exact path="/" element={<Homemid/>}> </Route>
      </Routes>
      <Routes>  
        <Route exact path="/courses" element={<Courses/>}> </Route>
      </Routes>
      <Routes>  
        <Route exact path="/compiler" element={<Compiler/>}> </Route>
      </Routes>
      <Routes>  
        <Route exact path="/webdev" element={<Webdev/>}> </Route>
      </Routes>
      <Routes>  
        <Route exact path="/practiceques" element={<Practiceques Ques ={ Ques }/>}> </Route>
      </Routes>
      <Routes>  
        <Route exact path="/createques" element={<Createques setQues = {setQues}/>}> </Route>
      </Routes>
      <Routes>  
        <Route exact path="/practice/ViewPracticeQn/:id" element={<ViewPracticeQn/>}> </Route>
      </Routes>
      <Routes>  
        <Route exact path="/ContestPortal" element={<ContestPortal/>}> </Route>
      </Routes>
      <Routes>  
        <Route exact path="/createContest" element={<CreateContest/>}> </Route>
      </Routes>
      <Routes>  
        <Route exact path="/createContestQn/:id" element={<CreateContestQn/>}> </Route>
      </Routes>
      <Routes>  
        <Route exact path="/contest/ViewContest/:id" element={<ViewContest/>}> </Route>
      </Routes>
      <Routes>  
        <Route exact path="/contest/ViewQn/:cid/:qid" element={<ViewContestQn/>}> </Route>
      </Routes>
      <Routes>  
        <Route exact path="/login" element={<Login/>}> </Route>
      </Routes>
      <Routes>  
        <Route exact path="/logout" element={<Logout/>}> </Route>
      </Routes>
      <Routes>  
        <Route exact path="/signup" element={<Signup/>}> </Route>
      </Routes>
    <Footer/>
    </Router>
    </>
  );
}

export default App;
