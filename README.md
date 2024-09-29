# FinanceTracker

###

Design Document

Dejarnett Kyle, Liz Atoyebi, Steven Lin, Cage Wellman, and Joshua Noiman

## Introduction
The Finance Tracker Application is designed to help users monitor and manage their personal finances. 
It provides tools to track income, expenses, set budgets, and create financial goals. 
By giving users a comprehensive overview of their financial situation, it aims to enhance financial discipline and awareness. 
The application is user-friendly, focusing on simplicity while offering powerful features for financial planning. 

## StoryBoard

[FinanceTracker Story Board](https://mailuc-my.sharepoint.com/:p:/g/personal/dejarnke_mail_uc_edu/ESzIoB7G1UFDj7PdxQgImJ0BSLLoNDhJMm471HpQWG-o_Q?wdOrigin=TEAMS-MAGLEV.p2p_ns.rwc&wdExp=TEAMS-TREATMENT&wdhostclicktime=1727453633285&web=1)

![HomePage](https://github.com/user-attachments/assets/359b4997-bfe5-4f63-98fd-1f4bc3ef1199)

![BudgetPage](https://github.com/user-attachments/assets/9de606e5-80be-4fd7-b1e1-b9262b7bca40)

![GoalTracker](https://github.com/user-attachments/assets/91032160-8a81-4408-8b12-0ff507c66caa)

## Functional Requirements

### Scenario

### Track Income and Expenses: 

As a User, I want to track my income and expenses so that I can monitor my financial transactions. 

Example Scenarios: 

**Given** I am on the transaction page, **When** I enter an income or expense amount and submit, 
**then** the transaction should be added to my summary. 

**Given** I enter a negative expense, **when** I press submit, 
**then** I should receive an error message. 

### Budget Management 

As a User, I want to set budgets for different categories 
so that I can control my spending. 

Example Scenarios: 

**Given** I am on the budget page, **when** I enter a category and amount, 
**then** the budget should be saved and shown in my overview. 

### Financial Goal Tracking 

As a User, I want to set financial goals, 
so that I can .track my progress toward them. 

Example Scenarios: 

**Given** I set a savings goal, when I add income, 
**then** the goal's progress should update. 

## Class Diagram

![Screenshot 2024-09-27 094544](https://github.com/user-attachments/assets/62834ced-ce29-4c7e-bd34-b9c02c522cdd)

### Class Diagram Description

**User:** Represents the user of the finance tracker app. Handles registration and login functionality. 

**Transaction:** Represents an income or expense transaction, containing details like the amount, category, and date. Handles adding and retrieving transactions. 

**Budget:** Represents a user-defined budget for a specific category, including the category name and allocated amount. Allows for budget creation and updates. 

**FinancialGoal:** Represents a financial goal, including the target amount, current progress, and deadline. Handles goal setting and tracking progress. 

**Account:** Represents the user’s financial account, including the balance and transactions. Handles income addition and balance calculations. 

## JSON Schema

### JSON Schema For User

```
{
    "$schema": "http://json-schema.org/draft-07/schema#",
    "type": "object",
    "properties": {
        "userID": {
            "type": "integer"
        },
        "password": {
            "type": "string"
        },
        "username": {
            "type": "string"
        }
    },
    "required": ["userID", "password", "username"]
}
```

### JSON Schema For Transaction

```
{
    "$schema": "http://json-schema.org/draft-07/schema#",
    "type": "object",
    "properties": {
        "transactionID": {
            "type": "integer"
        },
        "amount": {
            "type": "integer"
        },
        "category": {
            "type": "string"
        },
        "date": {
            "type": "integer"
        }
    },
    "required": ["transactionID", "amount", "category", "date"]
}

```

### JSON Schema For FinancialGoal

```
{
    "$schema": "http://json-schema.org/draft-07/schema#",
    "type": "object",
    "properties": {
        "goalID": {
            "type": "integer"
        },
        "targetAmount": {
            "type": "integer"
        },
        "currentAmount": {
            "type": "integer"
        },
        "dueDate": {
            "type": "integer"
        }
    },
    "required": ["goalID", "targetAmount", "currentAmount", "dueDate"]
}

```

### JSON Schema For Account

```
{
    "$schema": "http://json-schema.org/draft-07/schema#",
    "type": "object",
    "properties": {
        "accountID": {
            "type": "integer"
        },
        "userID": {
            "type": "integer"
        },
        "balance": {
            "type": "integer"
        }
    },
    "required": ["accountID", "userID", "balance"]
}

```

### JSON Schema For Budget

```
{
    "$schema": "http://json-schema.org/draft-07/schema#",
    "type": "object",
    "properties": {
        "budgetID": {
            "type": "integer"
        },
        "category": {
            "type": "string"
        },
        "amount": {
            "type": "integer"
        }
    },
    "required": ["budgetID", "category", "amount"]
}

```

## Project Link
Our project is hosted in github, found [here.](https://github.com/JoshNoiman/SpringBootFinanceTracker)

Here is the link if hyperlink is unavailable, https://github.com/JoshNoiman/SpringBootFinanceTracker

## Scrum Board

Link to Scrum/Kanban [Board:](https://github.com/users/slin05/projects/2)

Here is the link if hyperlink is unavailable, https://github.com/users/slin05/projects/2

## Scrum Roles
Product Owner/Scrum Master/ UI/UX Specialist: Liz Atoyebi 

Developer/Github Admin: Josh Noiman 

Developer: Kyle Dejarnett 

Developer: Steven Lin 

Developer: Cage Wellman 

## Weekly Meeting

 We meet every Monday at 4:30 via Microsoft Teams, found [here.](https://teams.microsoft.com/l/meetup-join/19%3ameeting_YjBkNzhlMWUtNWY2YS00ZDVlLWJlODItYmZkMjA0YmRlNGFk%40thread.v2/0?context=%7b%22Tid%22%3a%22f5222e6c-5fc6-48eb-8f03-73db18203b63%22%2c%22Oid%22%3a%225c3543c8-3744-49c5-8d08-38615296d597%22%7d)

 Here is the link if hyperlink is unavailable, https://teams.microsoft.com/l/meetup-join/19%3ameeting_YjBkNzhlMWUtNWY2YS00ZDVlLWJlODItYmZkMjA0YmRlNGFk%40thread.v2/0?context=%7b%22Tid%22%3a%22f5222e6c-5fc6-48eb-8f03-73db18203b63%22%2c%22Oid%22%3a%225c3543c8-3744-49c5-8d08-38615296d597%22%7d
