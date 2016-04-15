package com.example

import scalaj.http.{Http, HttpResponse}


object Hello {
  def main(args: Array[String]): Unit = {
    val response: HttpResponse[String] = Http("http://www.shigemk2.com").asString
    println(response.body)
    println(response.code)
    println(response.headers)
    println(response.cookies)
    println("Hello, world!")
  }
}
