// // Their are four types of nested classes
// // 1 - Static nested classes

// import Outer1.StaticNested;

// class Outer1 {
//     static class StaticNested {
//         void display() {
//             System.out.println("Static nested class");
//         }
//     }
// }
// // 2- Non- static nested classes
// class Outer2 {
//     class Inner {
//         void display() {
//             System.out.println("Inner class");
//         }
//     }
// }
// // 3 - Anonymous nested classes 
// interface Greeting {
//     void greet();
// }
// public class NestedClasses {
//     public static void main(String[] args) {
//         //4 - Local nested classes
//         class LocalClass {
//             void display() {
//                 System.out.println("Local class");
//             }
//         }

//         LocalClass local = new LocalClass();
//         local.display();
//         Greeting anonymousGreeting = new Greeting() {
//             public void greet() {
//                 System.out.println("Hello from an anonymous class");
//             }
//         };

//         anonymousGreeting.greet();        
//     }
// }
