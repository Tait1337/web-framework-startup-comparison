# Web-Framework Comparison

 Reactive frameworks help developers build web services for container-based environments such as ☸ Kubernetes and ⚡ serverless runtimes.

 Today, there are many mature frameworks available, including [Spring](<https://spring.io>), [Quarkus](<https://quarkus.io>), [Ktor](<https://ktor.io>), and [Http4k](<https://www.http4k.org>). Choosing between them depends on many factors, including 📝 licensing, 🕑 release frequency, 🙋 support, 🌎 ecosystem, and — especially for containerized workloads — 💪 performance.

 This project compares the runtime characteristics of **Http4k, Ktor, Quarkus, and Spring** using the same simple web-service application.

 ## What is being compared?

 Each implementation provides the following:

 - ❤️ **Kotlin** — Leverage the capabilities of Kotlin on the JVM and in native applications
- ⚡ **Reactive / non-blocking** — Support for efficient request processing
- 🧾 **JSON support** — JSON serialization and deserialization
- 🎈 **Native** — Compilation to a native executable without requiring a JVM at runtime
- 🌎 **Container** — Suitable for container-based deployment

 The benchmark compares both **JVM** and **native** builds, looking at:

 - Build time
- Artifact size
- Application startup time
- Memory consumption
- HTTP request latency

 ## Test Environment

 All tests were executed on the same **GitHub-hosted standard x64 runner**:

 - **CPU:** 4 vCPU
- **Memory:** 16 GB RAM
- **OS:** Ubuntu
- **Runner:** `ubuntu-latest`
- **Architecture:** x64

 Using the same hosted runner for all implementations provides a consistent environment for comparing the frameworks.

 ## Results

| Framework | Runtime | Status | Build | Artifact | Startup median | Startup P95 | Memory median | HTTP avg | HTTP P95 |
|---|---|---|---:|---:|---:|---:|---:|---:|---:|
| Http4k | jvm | success | 58333 ms | 8.98 MB | 645 ms | 693 ms | 95.64 MB | 1.066 ms | 1.474 ms |
| Http4k | native | success | 135862 ms | 34.15 MB | 19 ms | 19 ms | 38.55 MB | 0.322 ms | 0.371 ms |
| Ktor | jvm | success | 56080 ms | 10.69 MB | 444 ms | 471 ms | 83.87 MB | 1.621 ms | 2.319 ms |
| Ktor | native | success | 139216 ms | 46.60 MB | 23 ms | 23 ms | 37.59 MB | 0.587 ms | 0.658 ms |
| Quarkus | jvm | success | 66382 ms | 14.54 MB | 898 ms | 953 ms | 118.67 MB | 1.317 ms | 1.624 ms |
| Quarkus | native | success | 162283 ms | 38.99 MB | 18 ms | 20 ms | 37.19 MB | 0.353 ms | 0.402 ms |
| Spring | jvm | success | 77874 ms | 25.69 MB | 3110 ms | 3252 ms | 227.91 MB | 1.579 ms | 1.995 ms |
| Spring | native | success | 282513 ms | 73.04 MB | 55 ms | 62 ms | 89.82 MB | 0.475 ms | 0.630 ms |

 ## Sample Applications

 Check out the subdirectories to build and run each sample application yourself:

* **[Spring](Spring)**<br/>
* **[Quarkus](Quarkus)**<br/>
* **[Ktor](Ktor)**<br/>
* **[Http4k](Http4k)**<br/>

