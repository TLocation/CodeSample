package com.location.java.design.iterator

interface Aggregate<out T> {
  fun iterator(): Iterator<T>
}