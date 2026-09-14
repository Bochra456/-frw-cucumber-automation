# Mercury Cucumber Automation

Projet de tests automatisés end-to-end pour l'application **Mercury**, basé sur **Cucumber**, **Selenium WebDriver** et **TestNG**.

## 📌 Description

Ce projet permet de tester automatiquement les principaux parcours utilisateur de l'application Mercury :
- Connexion (Login)
- Inscription (Register)
- Parcours combinant plusieurs pages (Multiple Register)

Les scénarios sont écrits en Gherkin (BDD) et exécutés via Cucumber, avec TestNG comme runner et Selenium WebDriver pour piloter le navigateur.

## 🛠️ Stack technique

| Outil | Rôle |
|---|---|
| **Java** | Langage de développement |
| **Selenium WebDriver** | Automatisation des interactions navigateur |
| **Cucumber** | Framework BDD (Gherkin → exécution) |
| **TestNG** | Runner de tests et gestion des suites |
| **Maven** | Gestion des dépendances et du build |
| **Eclipse** | IDE de développement |
| **GitHub** | Gestion de versions / dépôt distant |

## 📁 Structure du projet

```
AutomationQA/
│
├── src/
│    ├── test/
│    │  └── java/
│    │      └── com/e2etests/automation/
│    │          └── page_objects/
│    │          │    ├── LoginPage.java
│    │          │    ├── MultiplePage.java
│    │          │    └── RegisterPage.java
│    │          ├── step_definitions/
│    │          │  ├── LoginStepDefinitions.java
│    │          │   ├── MultipleRegisterStepDefinitions.java
│    │          │   └── RegisterStepDefinitions.java
│    │          └── runners/
│    │             └── TestRunner.java
│    │
│    │
│    └── spec/
│           └── features/
│               ├── login.feature
│               ├── multipleRegister.feature
│               ├── register.feature
│               └── testRegister.feature
│
├── pom.xml
└── README.md
```

### 🧩 Page Objects
- **LoginPage** : localisation des éléments et actions de la page de connexion (champs username/password, bouton login, messages d'erreur).
- **RegisterPage** : localisation des éléments et actions du formulaire d'inscription (firstname, lastname, email, phone, adresse, city, province, code postal, country, username, password).
- **MultiplePage** : gère les parcours impliquant plusieurs pages/écrans (navigation entre pages liées à l'inscription ou à la connexion).

### 🪜 Step Definitions
- **LoginStepDefinitions** : implémente les steps Gherkin du fichier `login.feature`.
- **RegisterStepDefinitions** : implémente les steps Gherkin des fichiers `register.feature` / `testRegister.feature`.
- **MultipleRegisterStepDefinitions** : implémente les steps Gherkin du fichier `multipleRegister.feature`, couvrant les scénarios multi-pages.

### 🥒 Features (Gherkin)
- **login.feature** : scénarios de connexion (cas valides / invalides).
- **register.feature** : scénarios de création de compte (Scenario Outline avec Examples).
- **testRegister.feature** : scénarios de test complémentaires/variantes sur l'inscription.
- **multipleRegister.feature** : scénarios combinant plusieurs étapes/pages autour de l'inscription.

## ▶️ Exécution des tests

### Depuis Eclipse
1. Clic droit sur le fichier `TestRunner.java` → **Run As** → **TestNG Test**

### Depuis Maven (ligne de commande)
```bash
mvn clean test
```

### Exécuter un tag spécifique
```bash
mvn clean test -Dcucumber.filter.tags="@tag2"
```

## 📊 Rapports

Après exécution, un rapport Cucumber est généré au format JSON (`target/report.json`). Pour obtenir un rapport HTML lisible, voir la configuration du plugin `maven-cucumber-reporting` dans le `pom.xml`, puis ouvrir le fichier généré dans `target/cucumber-html-reports/`.

## ⚙️ Prérequis

- Java JDK 11+
- Maven 3.6+
- Navigateur (Chrome/Firefox) + driver correspondant
- Eclipse (ou tout IDE compatible Maven)

## 🚀 Installation

```bash
git clone https://github.com/Bochra456/-frw-cucumber-automation.git
cd -frw-cucumber-automation
mvn clean install
```

## 👤 Auteur

Projet réalisé dans le cadre de l'apprentissage/pratique des tests automatisés (QA / Testeur logiciel).
