fun outer() {
    typealias Test1 = <!RECURSIVE_TYPEALIAS_EXPANSION!>Test1<!>
    typealias Test2 = <!RECURSIVE_TYPEALIAS_EXPANSION!>List<Test2><!>
    typealias Test3<T> = List<<!UNRESOLVED_REFERENCE!>Test3<!><T>>
}