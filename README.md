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
Native build compilation was done with GraalVM 21.<br/>
Non-Native JVM build compilation and runtime was done with AdoptOpenJDK 11.0.7 on my Acer Aspire ES1-572 (4 Core x 2,5GHz, 16GB RAM, Windows 10, x64).<br/>
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
<td>4.4.2.0</td>
<td>8,47 MB</td>
<td>36.20 MB</td>
<td>163 ms</td>
<td>40 MB</td>
<td>6.8 ms</td>
<td>2.80 MB</td>
</tr>
<tr>
<td>Ktor</td>
<td>1.5.2</td>
<td>10,80 MB</td>
<td>48.7 MB</td>
<td>349.7 ms</td>
<td>54.67 MB</td>
<td>23.8 ms</td>
<td>4.87 MB</td>
</tr>
<tr>
<td>Quarkus</td>
<td>1.12.2</td>
<td>14,90 MB</td>
<td>140 MB**</td>
<td>1668.3 ms</td>
<td>84 MB</td>
<td>51.6 ms</td>
<td>14.68 MB</td>
</tr>
<tr>
<td>Spring</td>
<td>2.4.4</td>
<td>24,70 MB</td>
<td>92.2 MB</td>
<td>4828.2 ms</td>
<td>212.67 MB</td>
<td>86 ms</td>
<td>44.19 MB</td>
</tr>
</tbody>
</table>
* Without sending requests to the Application<br/>
** Quarkus make use of heavy (~ 100 MB) Red Hat hosted Base Image<br/>
<br/>
<br/>
Check out the sub directories to build and run the sample application your own:<br/>

* **[Spring](Spring)**<br/>
* **[Quarkus](Quarkus)**<br/>
* **[Ktor](Ktor)**<br/>
* **[Http4k](Http4k)**<br/>

