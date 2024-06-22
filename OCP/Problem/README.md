<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
</head>
<body>
    <div class="container">
        <h1>Problem Statement: Salary Calculation System</h1>
        <p>In our current salary calculation system, we face limitations when it comes to accommodating different types of employees with varying salary calculation methods.</p>
        <h2>Current Limitation</h2>
        <p>The existing system calculates salaries based on a fixed monthly salary for all employees. This approach does not support variations such as managers who may have a base salary plus bonuses, or hourly workers who are compensated based on hours worked.</p>
        <h2>Issues Faced</h2>
        <ul>
            <li><strong>Scalability Concerns:</strong> Introducing new types of employees with different salary structures requires modifying existing code, which increases complexity and maintenance efforts.</li>
            <li><strong>Violation of Open/Closed Principle:</strong> Modifying the existing salary calculation logic for new employee types contradicts the Open/Closed Principle, which advocates for systems that are open for extension but closed for modification.</li>
            <li><strong>Risk of Errors:</strong> Changes to the existing codebase to accommodate new salary calculation methods can introduce bugs or unintended behavior, particularly in critical systems like payroll management.</li>
        </ul>
        <h2>Objective</h2>
        <p>Our objective is to refactor the salary calculation system to support various types of employees with different salary structures, while adhering to the Open/Closed Principle and minimizing the need for modifying existing code.</p>
    </div>
</body>
</html>
