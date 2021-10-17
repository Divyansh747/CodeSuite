import { Card, CardBody } from 'reactstrap';
import React from 'react';

function Header({name, title}) {
    return(
        <Card className="my-4 bg-warning">
            <CardBody>
                <h1 className="text-center my-2">Online Compiler</h1>
            </CardBody>
        </Card>
    )
}

export default Header