# Web-Framework comparison

Reactive-Frameworks helps Developers to build WebServices for Container-based environments like ☸ Kubernetes or ⚡ Serverless Runtimes.<br/>
Nowadays many good Frameworks exists ([Spring](https://spring.io), [Quarkus](https://quarkus.io), [Ktor](https://ktor.io), [Http4k](https://www.http4k.org) ...) which needs to be compared in relation to work requirements.<br/>
<br/>
Beside criteria like 📝 Licence, 🕑 Release frequency, 🙋 Support and 🌎 Ecosystem comparison for 💪 performance matters.<br/>
<br/>
<br/>
This comparison shows the different startup-performance 🏃 with a common simple Web-Service App that contains of:<br/>
❤ **Awesome Kotlin** Leverage the best JVM language that exists<br/>
⚡ **Reactive** Powerful non-blocking programming model<br/>
🧾 **JSON support** Support for JSON marshaling<br/>
🎈 **Native** Compilation to native executable - no need for JVM<br/>
🌎 **Container** Run everywhere due to light docker container distribution<br/>
<br/>
<br/>
Native build compilation was done with GraalVM 22.<br/>
Non-Native JVM build compilation and runtime was done with OpenJDK 17.0.1 (Adoptium) on my Acer Aspire ES1-572 (4 Core x 2,5GHz, 16GB RAM, Windows 11, x64).<br/>
No application configuration or JVM performance tuning has been applied.<br/>

<table>
<thead>
<tr>
<th>Framework</th>
<th>Version</th>
<th>Uber Jar size</th>
<th>Container image size</th>
<th>Startup time (JVM)</th>
<th>Memory consumption (JVM)</th>
<th>Startup time (Native)</th>
<th>Memory consumption (Native)*</th>
</tr>
</thead>
<tbody>
<tr>
<td>Http4k</td>
<td>4.25.16.2</td>
<td>8.95 MB</td>
<td>41.50 MB</td>
<td>239 ms</td>
<td>26.6 MB</td>
<td>6.4 ms</td>
<td>2.86 MB</td>
</tr>
<tr>
<td>Ktor</td>
<td>2.0.1</td>
<td>10.60 MB</td>
<td>57.1 MB</td>
<td>551.4 ms</td>
<td>42.86 MB</td>
<td>11.6 ms</td>
<td>13.18 MB</td>
</tr>
<tr>
<td>Quarkus</td>
<td>2.9.2</td>
<td>14.50 MB</td>
<td>71.80 MB</td>
<td>1717.2 ms</td>
<td>66.98 MB</td>
<td>50.6 ms</td>
<td>22.06 MB</td>
</tr>
<tr>
<td>Spring</td>
<td>2.7.0</td>
<td>25.60 MB</td>
<td>96.9 MB</td>
<td>5535 ms</td>
<td>195.56 MB</td>
<td>147.2 ms</td>
<td>33.72 MB</td>
</tr>
</tbody>
</table>
* Without sending requests to the Application<br/>
<br/>
<br/>
Check out the sub directories to build and run the sample application your own:<br/>

* **[Spring](Spring)**<br/>
* **[Quarkus](Quarkus)**<br/>
* **[Ktor](Ktor)**<br/>
* **[Http4k](Http4k)**<br/>

