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
|   |               ├── 📁 MethodReferences/
|   |               └── 📁 interfaces/
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
