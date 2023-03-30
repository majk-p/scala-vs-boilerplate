---
theme: Uncover
size: 4:3
transition: drop
marp: true
---

# Get rid of the boilerplate

with Scala

###### by [Michał Pawlik](https://michalp.net/)

![bg right:27% 90%](img/scala-spiral.png)


---

# What's boilerplate?

---

# What's boilerplate?

Something you have to write but you don't want to

---

# Like what?

---

# Like this

```html
<!DOCTYPE html>
<html class="no-js" lang="">
<head>
  <meta charset="utf-8">
  <meta http-equiv="x-ua-compatible" content="ie=edge">   
  <title></title>
  <meta name="description" content="">
  <meta name="viewport" content="width=device-width, initial- scale=1, shrink-to-fit=no"> 
  <link rel="stylesheet" href="css/main.css">
</head>
```

---

# How to identify boilerplate?

---

# Boilerplate characteristics

* repetitive
* unnecessary
* burdensome

---

# Is it a real problem?

What's your opinion?

---

# Seems it is

2015 study on popular Java projects shows that 60% of methods can be uniquely identified by the occurrence of 4.6% of its tokens, making the remaining 95.4% boilerplate irrelevant to logic

<!-- _footer: "Martin Velez; Dong Qiu; You Zhou; Earl T. Barr; Zhendong Su (5 Feb 2015). \"On the Lexical Distinguishability of Source Code\" https://arxiv.org/abs/1502.01410" -->

---
<!-- _transition: flip -->

# Can we really avoid it?

---

# Let's give it a try!

---

# Get rid of boilerplate with Scala


![bg left:30% 90%](img/scala-spiral.png)

---

# What's scala anyway

* Functional and Object oriented
* concise, high-level language
* statically typed
* runs on JVM, JS and Native with LVM

---

# How does it help?

Let's see some examples,

Take the good old `hello world` for starters

---

# Java

```java
public class MyMainClass {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
```

---

# Python

```python
def main():
  println("hello world")

if __name__ == '__main__': 
  main()
```
---

# Python

```python
def main():
  println("hello world")

# this might be omitted depending how Pythonic you feel
if __name__ == '__main__': 
  main()
```

---

# Scala

```scala
@main
def main() =
  println("hello world")
```