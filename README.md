## 📅 Learning Java-8 features

---

### 📅 Day 1 – Java 8 Features & Advanced Java Practice  
**(Date: 27-Jan-2026)**             
**Branch:** `java8-programming-practice`

#### 📂 Project Structure

````text
BridgeLabz-Training/
│
├── 📁 java8-programming-practice/
│   ├── 📁 gcr-codebase/
│   │   └── 📁 Java8Programming/
│   │       └── 📁 src/
│   │           └── 📁 com/
│   │               ├── 📁 LamdaExpressions/
|   |               ├── 📁 FunctionalInterfaces/
|   |               ├── 📁 MethodReferences/
|   |               ├── 📁 StreamAPI/
|   |               └── 📁 Collectors/
|   └── 📁 scenario-based-codebase/
|
└── README.md
````

#### 🔹 Java 8 Core Concepts Learned
#### Lambda Expressions
- Learned **lambda expressions** as concise implementations of functional interfaces (SAM).
- Understood **target typing**, **type inference**, and **effectively final variables**.
- Compared **anonymous classes vs lambdas** (`this` behavior).
- Applied lambdas in:
  - Dynamic sorting (`Comparator`), Filtering (`Predicate`), Stream pipelines (`filter`, `map`, `collect`)

#### Method References
- Studied method references as readable alternatives to lambdas.
- Types covered:
  - Static (`Class::method`), Instance (`obj::method`), Unbound (`Class::instanceMethod`), Constructor (`Class::new`)
- Learned overload ambiguity handling and when to prefer lambdas.

#### Interfaces & Java 8 Enhancements
- Deep understanding of **@FunctionalInterface** and SAM conversion.
- Used built-in interfaces:
  - `Supplier`, `Consumer`, `Function`, `Predicate`
  - `UnaryOperator`, `BinaryOperator`, `Comparator`
- Created custom functional interfaces with default methods.
- **Default methods** for backward compatibility.
- **Static methods** for interface-level utilities.
- Method resolution rules (class wins, conflict resolution).
- Marker interfaces vs **annotations** (modern alternative).

🔗 **Code Links:**  
👉 [Day 1 - Lamda Expressions](https://github.com/Harshal-25C/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-practice/Java8Programming/src/com/LambdaExpressions)
👉 [Method References](https://github.com/Harshal-25C/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-practice/Java8Programming/src/com/MethodReferences)
👉 [Functional Interfaces](https://github.com/Harshal-25C/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-practice/Java8Programming/src/com/interfaces)

---

### 📅 Day 2 – Stream API (Java 8+)
**(Date: 28-Jan-2026)**     
**Branch:** `java8-programming-practice`

#### 🔹 Topics Learned
- **Stream API:** Functional-style processing of collections  
  `source → intermediate operations → terminal operation`
- **Intermediate Operations:** `filter`, `map`, `sorted`, `distinct`, `limit`
- **Terminal Operations:** `collect`, `forEach`, `reduce`, `count`
- **Parallel Streams:** `parallelStream()`, `ForkJoinPool`, ordering with forEachOrdered
- Lazy evaluation and stream pipeline execution
- Stateless vs stateful operations

#### 🔹 Practice Work
- Built multiple stream pipelines on collections
- Solved employee-based real-time problems using Stream API
- Focused on filtering, mapping, sorting, and reduction logic

🔗 **Code Link:**  
👉 [Day 2 - Stream API](https://github.com/Harshal-25C/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-practice/Java8Programming/src/com/StreamAPI)

---

### 📅 Day 3 – Collectors & Java 8 Features
**(Date: 29-Jan-2026)**            
**Branch:** `java8-programming-practice`

#### 🔹 Topics Learned
- **Collectors:** Accumulating stream results
  - `toList()`, `toSet()`, `toMap()`
  - `joining()`
  - `groupingBy()`
  - `partitioningBy()`
  - `summarizingInt()`
- **forEach():** Iteration using `Consumer`
- **Parallel Streams:** `parallelStream()`, `forEachOrdered()`
- Performance considerations & ForkJoinPool basics

#### 🔹 Scenario-Based Practice
- Solved **10 real-time Employee Stream problems**, including:
  - Gender-wise count & salary analysis
  - Department-wise grouping & averages
  - Highest/lowest & top-N salary queries
  - Experience-based and joining-year filters

🔗 **Code Link:**  
👉 [Day 3 - Collectors](https://github.com/Harshal-25C/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-practice/Java8Programming/src/com/Collectors)

---

### 📅 Day 4 – Lambda Expressions & Stream API Scenarios(Java 8)
**(Date: 30-Jan-2026)**         
**Branch:** `java8-programming-practice`

#### 🔹 Work Done
- Practiced **Lambda Expressions** with real-time scenarios (Student, Employee, Banking, E-Commerce)
- Used lambdas for **sorting, filtering, calculations, validation, and threading**
- Solved **advanced Stream API problems** on Students & Employees
- Applied `filter`, `map`, `sorted`, `limit`, `count`, `flatMap`
- Performed **grouping, aggregation, min/max, ranking, and partitioning**
- Converted collections to **Map** and handled **top/bottom N queries**

🔗 **Code Link:** 
👉 [Day 4 - Java8 Scenarios](https://github.com/Harshal-25C/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/scenario-based-codebase/Java8ScenarioPractice/src/com/StreamScenariosIntermediateProblems)

---

### 📅 Day 5 – Java 8 Stream API (Scenario-Based) & Multithreading
**(Date: 03-Feb-2026)**         
**Branch:** `java8-programming-practice`

#### 🔹 Java 8 Stream API – Scenario Practice
Solved **30+ real-world logical problems using Java Streams only**, focusing on:
- Character & word frequency analysis
- First / all non-repeating characters
- Removing duplicates & filtering characters
- String cleansing (alphabets, digits, alphanumeric)
- Numeric operations: sum, max, top-K, even/odd partitioning
- List & Map transformations, sorting, grouping, flattening
- Advanced queries like kth smallest, longest string, intersections

Emphasis on **filter, map, flatMap, distinct, sorted, limit, reduce, Collectors**

🔗 **Code Link:** 
👉 [Day 5 - Stream API Scenarios](https://github.com/Harshal-25C/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/scenario-based-codebase/Java8ScenarioPractice/src/com/StreamLogicalQuestions)

---

### 📅 Day 6 – Java 8 Stream API (Conversions)
**(Date: 04-Feb-2026)**           
**Branch:** `java8-programming-practice`

#### 🔹 What I Practiced
Solved **conversion-based logical problems using Java 8 Streams**, focusing on transforming data between different collection types.

#### 🔹 Key Conversions
- **List ↔ Map:** indexing, frequency count, grouping, handling duplicate keys
- **Map ↔ List:** keys, values, entries, sorting & filtering
- **List ↔ Set:** removing duplicates, ordering, sorting
- **Array ↔ Collections:** 1D/2D arrays, flattening, distinct mapping
- **Object Conversions:** grouping, flattening, composite keys
- **Other:** Stream/Optional conversions, formatted strings

✔ Strengthened hands-on skills with `Collectors`, `map`, `flatMap`, and `groupingBy`

👉 [Day 6 - Stream API Logical Questions](https://github.com/Harshal-25C/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/scenario-based-codebase/Java8ScenarioPractice/src/com/ConversionLogicalQuestions)

---
