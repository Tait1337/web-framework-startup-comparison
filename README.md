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
| Http4k | jvm | success | 57009 ms | 10.30 MB | 875 ms | 951 ms | 131.62 MB | 1.308 ms | 1.758 ms |
| Http4k | native | success | 91466 ms | 36.50 MB | 17 ms | 17 ms | 51.91 MB | 0.210 ms | 0.252 ms |
| Ktor | jvm | success | 49856 ms | 15.71 MB | 600 ms | 639 ms | 109.66 MB | 1.529 ms | 2.524 ms |
| Ktor | native | success | 171268 ms | 48.00 MB | 12 ms | 25 ms | 41.34 MB | 0.637 ms | 0.748 ms |
| Quarkus | jvm | success | 74021 ms | 17.64 MB | 938 ms | 1049 ms | 118.36 MB | 1.305 ms | 1.706 ms |
| Quarkus | native | success | 213429 ms | 47.25 MB | 39 ms | 41 ms | 48.88 MB | 0.395 ms | 0.455 ms |
| Spring | jvm | success | 82635 ms | 43.46 MB | 2704 ms | 3292 ms | 221.15 MB | 1.674 ms | 2.213 ms |
| Spring | native | success | 171814 ms | 129.69 MB | 55 ms | 57 ms | 117.46 MB | 0.249 ms | 0.283 ms |

 ## Sample Applications

 Check out the subdirectories to build and run each sample application yourself:

* **[Spring](Spring)**<br/>
* **[Quarkus](Quarkus)**<br/>
* **[Ktor](Ktor)**<br/>
* **[Http4k](Http4k)**<br/>

