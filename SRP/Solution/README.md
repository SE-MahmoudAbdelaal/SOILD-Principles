<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <div class="container">
        <h1>Solution: Applying Single Responsibility Principle (SRP)</h1>
        <p>To adhere to the Single Responsibility Principle (SRP), we need to separate the responsibilities of the <strong>Register</strong> class into distinct classes. This refactoring will ensure that each class has only one reason to change, improving maintainability and flexibility.</p>
        <h2>Proposed Changes</h2>
        <ul>
            <li><strong>Create a User Class:</strong> Introduce a new <em>User</em> class to encapsulate user information such as name and address. This class will handle user-related data and provide access to this data.</li>
            <li><strong>Refactor Register Class:</strong> Modify the <em>Register</em> class to focus solely on the registration process. This class will take a <em>User</em> object and handle the logic for registering a user.</li>
            <li><strong>Create a Notification Class:</strong> Introduce a new <em>Notification</em> class to handle notification responsibilities. This class will manage the logic for sending notifications, such as welcome messages.</li>
        </ul>
        <h2>Benefits of the Solution</h2>
        <ul>
            <li><strong>Single Responsibility:</strong> Each class will have a single responsibility, making the system more modular and easier to understand.</            <li><strong>Increased Cohesion:</strong> Classes will be more cohesive, as each class will only handle related functionalities.</li>
            <li><strong>Improved Maintainability:</strong> With clear separation of concerns, making changes to one part of the system (e.g., notification logic) will not affect other parts (e.g., registration logic).</li>
            <li><strong>Enhanced Testability:</strong> Each class can be tested independently, leading to more focused and manageable unit tests.</li>
            <li><strong>Greater Flexibility:</strong> The system will be more flexible and adaptable to changes, as modifications in one class will have minimal impact on others.</li>
        </ul>
    </div>
</body>
</html>
