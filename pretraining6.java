// Java: Troubleshooting a Technical Problem

// Learning Objectives:

// Discuss the difference between troubleshooting and debugging

// List the best practices when troubleshooting

// Troubleshooting is the process of identifying issues or problems occurring in
// code. Troubleshooting tends to exist at a higher level than debugging and
// applies to many components of a system. It's a process of parsing out the
// items that are dausing problems. This process requires interviewing the end
// users of the system to find out the steps they took to cause the problem.

// Reading a Stack Trace

// Learning Objectives:

// Describe how to read a stack trace

// Description of Reading a Stack Trace

// Each JVM thread (a path of execution) is associated with a stack that's
// created when the thread is created. This data structure is divided into
// frames, which are data structures associated with method calls. For this
// reason, each thread's stack is often referred to as a method-call stack.

// When an exception / error gets thrown, a stack trace is displayed to the
// console. New developers get concerned when they see a stack trace because
// they feel like they have broken their application. However, the purpose of a
// stack trace is to help find the problem so that it can be resolved. If you
// didn't have a stack trace, when an exception inyour prgram happens, it would
// be much harder to find out the fundamental issue with your logic.