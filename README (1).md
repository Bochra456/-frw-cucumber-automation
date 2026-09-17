# Mercury & SwagLabs Cucumber Automation

Projet de tests automatisés end-to-end pour l'application **Mercury** et **SwagLabs** , basé sur **Cucumber**, **Selenium WebDriver** et **TestNG**.

## 📌 Description

Ce projet permet de tester automatiquement les principaux parcours utilisateur de l'application Mercury :
- Connexion (Login)
- Inscription (Register/testRegister)
- Parcours combinant plusieurs pages (Multiple Register)

Sur l'application SwagLabs:

- Connexion (Authentification)

- Déconnexion/bouton About (Logout)

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
│    │          │    ├──AuthentificationPage.java
│    │          │    ├── LoginPage.java
│    │          │    ├── LogoutPage.java
│    │          │    ├── MultiplePage.java
│    │          │    └── RegisterPage.java
│    │          ├── step_definitions/
│    │          │   ├──AuthentificationStepDefinition.java
│    │          │   ├── LoginStepDefinitions.java
│    │          │   ├── LogoutStepDefinitions.java
│    │          │   ├── MultipleRegisterStepDefinitions.java
│    │          │   └── RegisterStepDefinitions.java
│    │          └── runners/
│    │             └── TestRunner.java
│    │
│    │
│    └── spec/
│           └── features/
│               ├── Authentification.feature
│               ├── Login.feature
│               ├── Logout.feature
│               ├── MultipleRegister.feature
│               ├── Register.feature
│               └── testRegister.feature
│
├── pom.xml
└── README(1).md
```

### 🧩 Page Objects
- **AuthentificationPage** : connexion avec des cas valides et invalides avec l'affichage d'un message d'erreur.
- **LogoutPage** : la localisation des éléments et actions de la page des deux boutons (Logout,About).
- **LoginPage** : localisation des éléments et actions de la page de connexion (champs username/password, bouton login, messages d'erreur).
- **RegisterPage** : localisation des éléments et actions du formulaire (firstname, lastname, email, phone, adresse, city, province, code postal, country, username, password).
- **MultiplePage** : gère les parcours impliquant plusieurs pages/écrans (navigation entre pages liées à l'inscription ou à la connexion).

### 🪜 Step Definitions
- **AuthentificationStepDefinitions** : implémente les steps Gherkin du fichier `Authentification.feature`
- **LogoutStepDefinitions** : implémente les steps Gherkin du fichier `Logout.feature`
- **LoginStepDefinitions** : implémente les steps Gherkin du fichier `Login.feature`.
- **RegisterStepDefinitions** : implémente les steps Gherkin des fichiers `Register.feature` / `testRegister.feature`.
- **MultipleRegisterStepDefinitions** : implémente les steps Gherkin du fichier `MultipleRegister.feature`, couvrant les scénarios multi-pages.

### 🥒 Features (Gherkin)
- **Authentification.feature** : scénarios de connexion des cas (valides/invalides) sur l'application SwagLabs.
- **Logout.feature** : scénarios de tester les boutons (logout/about) sur SwagLabs.
- **Login.feature** : scénarios de connexion de cas valide sur Mercury.
- **Register.feature** : scénarios de création de compte (Scenario Outline avec Examples) sur Mercury.
- **testRegister.feature** : scénarios de test complémentaires/variantes sur l'inscription .
- **MultipleRegister.feature** : scénarios combinant plusieurs étapes/pages autour de l'inscription.

## ▶️ Exécution des tests

### Depuis Eclipse
1. Clic droit sur le fichier `TestRunner.java` → **Run As** → **JUnit Test**

### Depuis Maven (ligne de commande)
```bash
mvn clean test
```

### Exécuter un tag spécifique
```bash
mvn clean test -Dcucumber.filter.tags="@logout"
```

## 📊 Rapports

Après exécution, un rapport Cucumber est généré au format JSON (`target/report.json`). Pour obtenir un rapport HTML lisible, voir la configuration du plugin `maven-cucumber-reporting` dans le `pom.xml`, puis ouvrir le fichier généré dans `target/cucumber-html-reports/`.

## ⚙️ Prérequis

- Java JDK 11+
- Maven 3.6+
- Navigateur (Chrome) + driver correspondant
- Eclipse (ou tout IDE compatible Maven)

## 🚀 Installation

```bash
git clone https://github.com/Bochra456/-frw-cucumber-automation.git
cd -frw-cucumber-automation
mvn clean install
```

## 👤 Auteur

Projet réalisé dans le cadre de l'apprentissage/pratique des tests automatisés (QA / Testeur logiciel).
