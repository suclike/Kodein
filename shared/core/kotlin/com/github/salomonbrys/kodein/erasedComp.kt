package com.github.salomonbrys.kodein

/**
 * Creates a [CompositeTypeToken] for an erased generic type.
 *
 * Example: to create an erased type token representing `Set<String>`, use `erasedComp1<Set<String>, String>()`.
 *
 * @param T The main type represented by this type token.
 * @param A1 The type parameter of the main type.
 */
inline fun <reified T, reified A1> erasedComp1() = CompositeTypeToken(erased<T>(), erased<A1>())

/**
 * Creates a [CompositeTypeToken] for an erased generic type.
 *
 * Example: to create an erased type token representing `Map<Int, String>`, use `erasedComp2<Map<Int, String>, Int, String>()`.
 *
 * @param T The main type represented by this type token.
 * @param A1 The first type parameter of the main type.
 * @param A2 The second type parameter of the main type.
 */
inline fun <reified T, reified A1, reified A2> erasedComp2() = CompositeTypeToken(erased<T>(), erased<A1>(), erased<A2>())

/**
 * Creates a [CompositeTypeToken] for an erased generic type.
 *
 * Example: to create an erased type token representing `Triple<Int, String, Int>`, use `erasedComp3<Triple<Int, String, Int>, Int, String, Int>()`.
 *
 * @param T The main type represented by this type token.
 * @param A1 The type parameter of the main type.
 * @param A2 The second type parameter of the main type.
 * @param A3 The third type parameter of the main type.
 */
inline fun <reified T, reified A1, reified A2, reified A3> erasedComp3() = CompositeTypeToken(erased<T>(), erased<A1>(), erased<A2>(), erased<A3>())

/**
 * Creates a [CompositeTypeToken] that defines a `Set<T>`.
 *
 * @param T The parameter type of the set.
 */
inline fun <reified T> erasedSet() = erasedComp1<Set<T>, T>()
