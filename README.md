# 📘 Kotlin — Start From Basic to Advanced

> A complete hands-on study repository based on **Kotlin in Action (2nd Edition)** by Dmitry Jemerov & Svetlana Isakova — including all chapter code examples, personal notes, intermediate practice files, and real mini-projects.

---

## 👨‍💻 About This Repository

This repository documents my full journey of learning Kotlin — from the very basics all the way to advanced topics like **Coroutines**, **Flow**, **Generics**, **DSLs**, **Reflection**, and **Testing**.

It is organized into sections that mirror the book chapters, with additional practice sets, intermediate test drives, and self-built mini projects to reinforce each concept.

- 📖 **Book Covered:** Kotlin in Action, 2nd Edition
- 🗂️ **Total Files:** 900+ Kotlin source files
- 📁 **Total Folders:** 53 directories
- 🧠 **Chapters Completed:** 1 → 18 (full book)
- 📝 **Notes:** Personal summary notes for every chapter

---

## 🛠️ Tech Stack & Tools

| Tool | Purpose |
|------|---------|
| Kotlin | Primary language |
| JVM | Runtime environment |
| IntelliJ IDEA / Android Studio | IDE used for writing code |
| kotlinx-coroutines | Coroutines & Flow library |
| Turbine | Flow testing library |
| kotlin-test | Unit testing |

---

## 📁 Project Structure

```
Kotlin_Start_From_Besic/
│
├── ReadMe.txt
│
├── basics/                                 ← Entry-level Kotlin programs
│   └── vikash/com/
│       ├── Collection_TestDrive_1.kt
│       ├── EntryPointTestDrive_1.kt
│       ├── FilterAdultsTestDrive_2.kt
│       ├── GetGrade_TestDrve_2.kt
│       ├── Import_With_Alises.kt
│       ├── Input_Int_TestDrive_1.kt
│       ├── Math_TestDrive_2.kt
│       ├── Name_TestDrive_2.kt
│       ├── Null_TestDrive_2.kt
│       ├── Person_TestDrive_2.kt
│       ├── Point_TestDrive_2.kt
│       ├── ReadLine_TestDrive_1.kt
│       ├── SafeReadInt_TestDrive_1.kt
│       ├── TestDrive_With_package_1.kt
│       ├── Variable_TestDrive_2.kt
│       └── ... (21 files total)
│
├── Basic_Programs/                         ← Core Kotlin syntax programs (27 files)
│   ├── AllTypeVariable.kt
│   ├── CollectionFile.kt
│   ├── ForLoop_Test.kt
│   ├── Hello.kt
│   ├── IfElseTest.kt
│   ├── MapProgram.kt
│   ├── StringTest.kt
│   ├── WhenUsingTest.kt
│   ├── Functions_Programs/
│   │   ├── FunctionTest_1.kt
│   │   ├── Hello.kt
│   │   ├── Practice_1.kt
│   │   └── PrintMessage.kt
│   ├── LambdaExpressions/
│   │   ├── FirstLambda.kt
│   │   ├── FunctionTypes.kt
│   │   ├── LambdaExperesstionTestDrive.kt
│   │   └── TrlilingLambdaExample.kt
│   ├── NullSaftyPrograms/
│   │   ├── DescribeingString.kt
│   │   ├── NullableTestDrive.kt
│   │   └── Practice_1.kt
│   └── OOPS_In_Kotlin/
│       ├── Employee_TestDrive.kt
│       ├── Firstclass.kt
│       ├── StudentTestDrive.kt
│       └── UserTest.kt
│
├── Intermediate_TestDrive/                 ← OOP, Scope Functions, Delegates (160+ files)
│   ├── AbstractBankAccount_TestDrive.kt
│   ├── AnimalTestDrive.kt
│   ├── BankAccount_TestDrive_10.kt
│   ├── CompanionObjectTestDrive.kt
│   ├── Delegate_propeties_TestDrive.kt
│   ├── EnumsClassTestDrive.kt
│   ├── Extenstion_Function.kt
│   ├── InheritenceTestDrive.kt
│   ├── InterfaceTestDrive.kt
│   ├── SealedClassTestDrive.kt
│   ├── SmartDeviceTestDrive.kt
│   └── ... (160+ files)
│
├── Kotlin_In_Action_second_edition/        ← 📖 Main book study folder
│   │
│   ├── Chapter 1/   ← Kotlin: What and Why (2 files)
│   │   ├── Main_Test_1.kt
│   │   └── Main_Test_2.kt
│   │
│   ├── Chapter 2/   ← Kotlin Basics: Variables, When, Loops (26 files)
│   │   ├── Enums_TestDrive_1.kt
│   │   ├── FizzBuzz_For_1.kt
│   │   ├── Main1.kt
│   │   └── ...
│   │
│   ├── Chapter 3/   ← Functions, Extensions, Collections (19 files)
│   │   ├── ExtenstionTestDrive_1.kt
│   │   ├── JoinToString_With_Extention.kt
│   │   └── ...
│   │
│   ├── Chapter_4/   ← Classes, Objects, Interfaces (43 files)
│   ├── Chapter_5/   ← Lambdas & Functional Programming (33 files)
│   ├── Chapter_6/   ← Collections API & Sequences (24 files)
│   ├── Chapter_7/   ← Null Safety & Smart Casts (27 files)
│   ├── Chapter_8/   ← Type System & Arrays (25 files)
│   ├── Chapter_9/   ← Operator Overloading & Conventions (33 files)
│   ├── Chapter_10/  ← Higher-Order Functions & Generics (46 files)
│   ├── Chapter_11/  ← Generics & Variance (in/out) (41 files)
│   ├── Chapter_12/  ← Annotations & Reflection (26 files)
│   ├── Chapter_13/  ← DSL Construction (15 files)
│   ├── Chapter_14/  ← Coroutines: Basics (29 files)
│   ├── Chapter_15/  ← Coroutine Cancellation & Context (22 files)
│   ├── Chapter_16/  ← Kotlin Flow (38 files)
│   ├── Chapter_17/  ← Flow Operators (23 files)
│   ├── Chapter_18/  ← Coroutine Testing & Exception Handling (30 files)
│   │
│   ├── Notes/                              ← 📝 Personal chapter-by-chapter notes
│   │   ├── Chapter_1/1.kt
│   │   ├── Chapter_2/2.kt
│   │   ├── Chapter_3/3.kt
│   │   ├── Chapter_4/4.kt
│   │   ├── chapter_5/5.kt
│   │   ├── Chapter_6/6.kt
│   │   ├── Chapter_7/7.kt
│   │   ├── Chapter_8/8.kt
│   │   ├── Chapter_9/9.kt
│   │   ├── Chapter_10/10.kt
│   │   ├── Chapter_11/11.kt
│   │   ├── Chapter_12/12.kt
│   │   ├── Chapter_13/13.kt
│   │   ├── Chapter_14/14.kt
│   │   ├── Chapter_15/15.kt
│   │   ├── Chapter_16/16.kt
│   │   ├── Chapter_17/17.kt
│   │   └── Chapter_18/18.kt
│   │
│   └── libsKotlin/                         ← External library JARs
│       ├── kotlin-test-2.3.20.jar
│       ├── kotlinx-coroutines-core-jvm-1.10.2.jar
│       ├── kotlinx-coroutines-test-jvm-1.10.2.jar
│       └── turbine-jvm-1.2.1.jar
│
├── Practise_Set_1/                         ← Standalone practice exercises
│   ├── EvenOdd.kt
│   ├── Practice_1.kt
│   └── Practice_2.kt
│
├── Project/                                ← 🚀 15 real mini projects
│   ├── BankAccountTramsFrem.kt
│   ├── EvenOddchack.kt
│   ├── FitnessWorkerCalculaterTestDrive_1.kt
│   ├── FuleCalculaterTestDrive_1.kt
│   ├── GessingGame.kt
│   ├── MaskCalculater.kt
│   ├── MultiplicationTestDrive.kt
│   ├── PlanetDetals_TestDrive_1.kt
│   ├── ResturentBill_TestDrive_1.kt
│   ├── SimpleCalculater.kt
│   ├── SimpleCalculaterTestDrive_1.kt
│   ├── SimpleInterestCalculater.kt
│   ├── SportScoreBoardAnnouncer.kt
│   ├── StudentDitalsDestDrive_1.kt
│   ├── TempreatureConverter.kt
│   └── TemprecherChack.kt
│
└── Standard_Library/                       ← Kotlin Standard Library exploration (7 files)
    ├── Main_TestDrive_1.kt
    ├── Math_TestDrive_2.kt
    ├── Opt_TestDrive_1.kt
    ├── StarePrintTestDrive_1.kt
    ├── TimeChack_TestDrive_1.kt
    ├── Time_TestDrive_1.kt
    └── Times_TestDrive_1.kt
```

---

## 📚 Chapter Overview

| Chapter | Topic | Files |
|---------|-------|-------|
| Chapter 1 | Kotlin: What and Why | 2 |
| Chapter 2 | Kotlin Basics — Variables, `when`, Loops | 26 |
| Chapter 3 | Functions, Extensions, Collections | 19 |
| Chapter 4 | Classes, Objects, Interfaces | 43 |
| Chapter 5 | Lambdas & Functional Programming | 33 |
| Chapter 6 | Collections API & Sequences | 24 |
| Chapter 7 | Null Safety & Smart Casts | 27 |
| Chapter 8 | Type System & Arrays | 25 |
| Chapter 9 | Operator Overloading & Conventions | 33 |
| Chapter 10 | Higher-Order Functions & Generics | 46 |
| Chapter 11 | Generics, Variance (`in`/`out`) | 41 |
| Chapter 12 | Annotations & Reflection | 26 |
| Chapter 13 | DSL Construction | 15 |
| Chapter 14 | Coroutines — Basics | 29 |
| Chapter 15 | Coroutine Cancellation & Context | 22 |
| Chapter 16 | Kotlin Flow | 38 |
| Chapter 17 | Flow Operators | 23 |
| Chapter 18 | Coroutine Testing & Exception Handling | 30 |

---

## 🚀 Mini Projects Included

| Project | Description |
|---------|-------------|
| `SimpleCalculater.kt` | Basic arithmetic calculator |
| `GessingGame.kt` | Number guessing game with input |
| `BankAccountTramsFrem.kt` | Bank account with transfer logic |
| `TempreatureConverter.kt` | Celsius ↔ Fahrenheit converter |
| `ResturentBill_TestDrive_1.kt` | Restaurant bill with tip calculator |
| `FitnessWorkerCalculaterTestDrive_1.kt` | Fitness calorie calculator |
| `FuleCalculaterTestDrive_1.kt` | Fuel cost calculator |
| `PlanetDetals_TestDrive_1.kt` | Planet details display system |
| `SportScoreBoardAnnouncer.kt` | Sports scoreboard announcer |
| `MaskCalculater.kt` | Mask/IP calculator |
| `SimpleInterestCalculater.kt` | Simple interest calculator |
| `StudentDitalsDestDrive_1.kt` | Student detail management |
| `TemprecherChack.kt` | Temperature range checker |
| `EvenOddchack.kt` | Even/odd number checker |
| `MultiplicationTestDrive.kt` | Multiplication table generator |

---

## 📝 How to Run Any File

Each `.kt` file is a standalone Kotlin program with a `main()` function. To run any file:

**Using IntelliJ IDEA / Android Studio:**
1. Open the project folder in IntelliJ IDEA
2. Navigate to any `.kt` file
3. Click the green ▶️ Run button next to `fun main()`

**Using Command Line (kotlinc):**
```bash
# Install Kotlin compiler first: https://kotlinlang.org/docs/command-line.html
kotlinc FileName.kt -include-runtime -d output.jar
java -jar output.jar
```

**For Coroutine files (Chapter 14–18)**, make sure the `kotlinx-coroutines-core` JAR from the `libsKotlin/` folder is on your classpath.

---

## 🌱 What I Learned

- ✅ Kotlin syntax, variables, control flow
- ✅ Functions, default parameters, named arguments
- ✅ Extension functions and properties
- ✅ Object-Oriented Programming in Kotlin
- ✅ Data classes, sealed classes, enum classes
- ✅ Lambdas, higher-order functions, scope functions (`let`, `run`, `apply`, `also`, `with`)
- ✅ Collections API — `filter`, `map`, `flatMap`, `groupBy`, `fold`, `reduce`
- ✅ Sequences for lazy evaluation
- ✅ Null safety — safe calls, Elvis operator, non-null assertion
- ✅ Generics, variance (`in` / `out`), star projections
- ✅ Operator overloading and conventions
- ✅ Annotations and Reflection
- ✅ DSL building with extension lambdas
- ✅ Coroutines — `launch`, `async`, `suspend`, `runBlocking`
- ✅ Coroutine context, dispatchers, cancellation
- ✅ Kotlin Flow — cold flows, hot flows (`StateFlow`, `SharedFlow`)
- ✅ Flow operators — `map`, `filter`, `buffer`, `debounce`, `conflate`
- ✅ Coroutine testing with `runTest` and **Turbine**

---

## 📌 Notes

- The `Notes/` folder contains personal chapter summaries written as Kotlin comment blocks — great for quick revision.
- File names ending in `_TestDrive` follow a naming convention used throughout *Kotlin in Action* for runnable examples.
- Some `.jar` files are included locally for chapters that require coroutine or test dependencies.

---

## 📖 Book Reference

> **Kotlin in Action, 2nd Edition**
> Authors: Dmitry Jemerov, Svetlana Isakova, Sebastian Aigner
> Publisher: Manning Publications
> Website: [https://www.manning.com/books/kotlin-in-action-second-edition](https://www.manning.com/books/kotlin-in-action-second-edition)

---

## 🙋 About Me

I'm a Kotlin learner who completed the entire *Kotlin in Action* book from basics to advanced topics. This repository is my personal study log — every file here was written and tested by me as part of my learning journey.

---

⭐ If you find this repository helpful for your own Kotlin learning, feel free to star it!
