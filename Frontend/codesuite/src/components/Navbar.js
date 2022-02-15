import React from 'react'
import '../App.css';
import { Link } from 'react-router-dom';
import logo from '../images/logo1.png';

export default function Navbar() {
    return (
        <>
            <nav> 
                <div className = "Nav-elem"> 
                <div id="logo"> <img src={logo} width='200px' /></div> 
                <ul className="li-item">
                    <li > <Link to="/">Features </Link></li>
                    <li > <Link to="/courses"> Courses </Link> </li>
                </ul>
                <div className="btn"> <Link to="/login">Login </Link>  </div>
                <div className="btn"> <Link to="/signup">Register </Link>  </div>
            </div>
            </nav>
        </>
    )
}
