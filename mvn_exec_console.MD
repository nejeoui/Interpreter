Leads-MacBook-Pro:interpreter leaddev$ mvn -X exec:java -Dstart-class=com.nejeoui.interpreter.InterpreterApplication
Apache Maven 3.6.2 (40f52333136460af0dc0d7232c0dc0bcf0d9e117; 2019-08-27T16:06:16+01:00)
Maven home: /usr/local/Cellar/maven/3.6.2/libexec
Java version: 11, vendor: Oracle Corporation, runtime: /Library/Java/JavaVirtualMachines/jdk-11.jdk/Contents/Home
Default locale: en_US, platform encoding: UTF-8
OS name: "mac os x", version: "10.14.6", arch: "x86_64", family: "mac"
[DEBUG] Created new class realm maven.api
[DEBUG] Importing foreign packages into class realm maven.api
[DEBUG]   Imported: javax.annotation.* < plexus.core
[DEBUG]   Imported: javax.annotation.security.* < plexus.core
[DEBUG]   Imported: javax.enterprise.inject.* < plexus.core
[DEBUG]   Imported: javax.enterprise.util.* < plexus.core
[DEBUG]   Imported: javax.inject.* < plexus.core
[DEBUG]   Imported: org.apache.maven.* < plexus.core
[DEBUG]   Imported: org.apache.maven.artifact < plexus.core
[DEBUG]   Imported: org.apache.maven.classrealm < plexus.core
[DEBUG]   Imported: org.apache.maven.cli < plexus.core
[DEBUG]   Imported: org.apache.maven.configuration < plexus.core
[DEBUG]   Imported: org.apache.maven.exception < plexus.core
[DEBUG]   Imported: org.apache.maven.execution < plexus.core
[DEBUG]   Imported: org.apache.maven.execution.scope < plexus.core
[DEBUG]   Imported: org.apache.maven.lifecycle < plexus.core
[DEBUG]   Imported: org.apache.maven.model < plexus.core
[DEBUG]   Imported: org.apache.maven.monitor < plexus.core
[DEBUG]   Imported: org.apache.maven.plugin < plexus.core
[DEBUG]   Imported: org.apache.maven.profiles < plexus.core
[DEBUG]   Imported: org.apache.maven.project < plexus.core
[DEBUG]   Imported: org.apache.maven.reporting < plexus.core
[DEBUG]   Imported: org.apache.maven.repository < plexus.core
[DEBUG]   Imported: org.apache.maven.rtinfo < plexus.core
[DEBUG]   Imported: org.apache.maven.settings < plexus.core
[DEBUG]   Imported: org.apache.maven.toolchain < plexus.core
[DEBUG]   Imported: org.apache.maven.usability < plexus.core
[DEBUG]   Imported: org.apache.maven.wagon.* < plexus.core
[DEBUG]   Imported: org.apache.maven.wagon.authentication < plexus.core
[DEBUG]   Imported: org.apache.maven.wagon.authorization < plexus.core
[DEBUG]   Imported: org.apache.maven.wagon.events < plexus.core
[DEBUG]   Imported: org.apache.maven.wagon.observers < plexus.core
[DEBUG]   Imported: org.apache.maven.wagon.proxy < plexus.core
[DEBUG]   Imported: org.apache.maven.wagon.repository < plexus.core
[DEBUG]   Imported: org.apache.maven.wagon.resource < plexus.core
[DEBUG]   Imported: org.codehaus.classworlds < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.* < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.classworlds < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.component < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.configuration < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.container < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.context < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.lifecycle < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.logging < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.personality < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.util.xml.Xpp3Dom < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.util.xml.pull.XmlPullParser < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.util.xml.pull.XmlPullParserException < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.util.xml.pull.XmlSerializer < plexus.core
[DEBUG]   Imported: org.eclipse.aether.* < plexus.core
[DEBUG]   Imported: org.eclipse.aether.artifact < plexus.core
[DEBUG]   Imported: org.eclipse.aether.collection < plexus.core
[DEBUG]   Imported: org.eclipse.aether.deployment < plexus.core
[DEBUG]   Imported: org.eclipse.aether.graph < plexus.core
[DEBUG]   Imported: org.eclipse.aether.impl < plexus.core
[DEBUG]   Imported: org.eclipse.aether.installation < plexus.core
[DEBUG]   Imported: org.eclipse.aether.internal.impl < plexus.core
[DEBUG]   Imported: org.eclipse.aether.metadata < plexus.core
[DEBUG]   Imported: org.eclipse.aether.repository < plexus.core
[DEBUG]   Imported: org.eclipse.aether.resolution < plexus.core
[DEBUG]   Imported: org.eclipse.aether.spi < plexus.core
[DEBUG]   Imported: org.eclipse.aether.transfer < plexus.core
[DEBUG]   Imported: org.eclipse.aether.version < plexus.core
[DEBUG]   Imported: org.fusesource.jansi.* < plexus.core
[DEBUG]   Imported: org.slf4j.* < plexus.core
[DEBUG]   Imported: org.slf4j.event.* < plexus.core
[DEBUG]   Imported: org.slf4j.helpers.* < plexus.core
[DEBUG]   Imported: org.slf4j.spi.* < plexus.core
[DEBUG] Populating class realm maven.api
[INFO] Error stacktraces are turned on.
[DEBUG] Message scheme: color
[DEBUG] Message styles: debug info warning error success failure strong mojo project
[DEBUG] Reading global settings from /usr/local/Cellar/maven/3.6.2/libexec/conf/settings.xml
[DEBUG] Reading user settings from /Users/leaddev/.m2/settings.xml
[DEBUG] Reading global toolchains from /usr/local/Cellar/maven/3.6.2/libexec/conf/toolchains.xml
[DEBUG] Reading user toolchains from /Users/leaddev/.m2/toolchains.xml
[DEBUG] Using local repository at /Users/leaddev/.m2/repository
[DEBUG] Using manager EnhancedLocalRepositoryManager with priority 10.0 for /Users/leaddev/.m2/repository
[INFO] Scanning for projects...
[DEBUG] Extension realms for project com.nejeoui:interpreter:jar:1.0.0-SNAPSHOT: (none)
[DEBUG] Looking up lifecycle mappings for packaging jar from ClassRealm[plexus.core, parent: null]
[DEBUG] Extension realms for project org.springframework.boot:spring-boot-starter-parent:pom:2.1.9.RELEASE: (none)
[DEBUG] Looking up lifecycle mappings for packaging pom from ClassRealm[plexus.core, parent: null]
[DEBUG] Extension realms for project org.springframework.boot:spring-boot-dependencies:pom:2.1.9.RELEASE: (none)
[DEBUG] Looking up lifecycle mappings for packaging pom from ClassRealm[plexus.core, parent: null]
[DEBUG] Resolving plugin prefix exec from [org.apache.maven.plugins, org.codehaus.mojo]
[DEBUG] Resolved plugin prefix exec to org.codehaus.mojo:exec-maven-plugin from POM com.nejeoui:interpreter:jar:1.0.0-SNAPSHOT
[DEBUG] === REACTOR BUILD PLAN ================================================
[DEBUG] Project: com.nejeoui:interpreter:jar:1.0.0-SNAPSHOT
[DEBUG] Tasks:   [exec:java]
[DEBUG] Style:   Regular
[DEBUG] =======================================================================
[INFO] 
[INFO] ----------------------< com.nejeoui:interpreter >-----------------------
[INFO] Building interpreter 1.0.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[DEBUG] Resolving plugin prefix exec from [org.apache.maven.plugins, org.codehaus.mojo]
[DEBUG] Resolved plugin prefix exec to org.codehaus.mojo:exec-maven-plugin from POM com.nejeoui:interpreter:jar:1.0.0-SNAPSHOT
[DEBUG] Lifecycle default -> [validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy]
[DEBUG] Lifecycle clean -> [pre-clean, clean, post-clean]
[DEBUG] Lifecycle site -> [pre-site, site, post-site, site-deploy]
[DEBUG] === PROJECT BUILD PLAN ================================================
[DEBUG] Project:       com.nejeoui:interpreter:1.0.0-SNAPSHOT
[DEBUG] Dependencies (collect): []
[DEBUG] Dependencies (resolve): [test]
[DEBUG] Repositories (dependencies): [central (https://repo.maven.apache.org/maven2, default, releases)]
[DEBUG] Repositories (plugins)     : [central (https://repo.maven.apache.org/maven2, default, releases)]
[DEBUG] -----------------------------------------------------------------------
[DEBUG] Goal:          org.codehaus.mojo:exec-maven-plugin:1.6.0:java (default-cli)
[DEBUG] Style:         Regular
[DEBUG] Configuration: <?xml version="1.0" encoding="UTF-8"?>
<configuration>
  <addOutputToClasspath default-value="true">${addOutputToClasspath}</addOutputToClasspath>
  <addResourcesToClasspath default-value="false">${addResourcesToClasspath}</addResourcesToClasspath>
  <arguments>${exec.arguments}</arguments>
  <classpathScope default-value="runtime">${exec.classpathScope}</classpathScope>
  <cleanupDaemonThreads default-value="true">${exec.cleanupDaemonThreads}</cleanupDaemonThreads>
  <commandlineArgs>${exec.args}</commandlineArgs>
  <daemonThreadJoinTimeout default-value="15000">${exec.daemonThreadJoinTimeout}</daemonThreadJoinTimeout>
  <includePluginDependencies default-value="false">${exec.includePluginsDependencies}</includePluginDependencies>
  <includeProjectDependencies default-value="true">${exec.includeProjectDependencies}</includeProjectDependencies>
  <keepAlive default-value="false">${exec.keepAlive}</keepAlive>
  <killAfter default-value="-1">${exec.killAfter}</killAfter>
  <localRepository default-value="${localRepository}"/>
  <mainClass>com.nejeoui.interpreter.InterpreterApplication</mainClass>
  <pluginDependencies default-value="${plugin.artifacts}"/>
  <project default-value="${project}"/>
  <remoteRepositories default-value="${project.remoteArtifactRepositories}"/>
  <skip default-value="false">${exec.skip}</skip>
  <sourceRoot>${sourceRoot}</sourceRoot>
  <stopUnresponsiveDaemonThreads default-value="false">${exec.stopUnresponsiveDaemonThreads}</stopUnresponsiveDaemonThreads>
  <testSourceRoot>${testSourceRoot}</testSourceRoot>
</configuration>
[DEBUG] =======================================================================
[DEBUG] Dependency collection stats: {ConflictMarker.analyzeTime=1280336, ConflictMarker.markTime=736147, ConflictMarker.nodeCount=124, ConflictIdSorter.graphTime=923108, ConflictIdSorter.topsortTime=596784, ConflictIdSorter.conflictIdCount=71, ConflictIdSorter.conflictIdCycleCount=0, ConflictResolver.totalTime=12074206, ConflictResolver.conflictItemCount=117, DefaultDependencyCollector.collectTime=391123432, DefaultDependencyCollector.transformTime=18394308}
[DEBUG] com.nejeoui:interpreter:jar:1.0.0-SNAPSHOT
[DEBUG]    org.springframework.boot:spring-boot-starter-thymeleaf:jar:2.1.9.RELEASE:compile
[DEBUG]       org.springframework.boot:spring-boot-starter:jar:2.1.9.RELEASE:compile (version managed from 2.1.9.RELEASE)
[DEBUG]          org.springframework.boot:spring-boot-starter-logging:jar:2.1.9.RELEASE:compile (version managed from 2.1.9.RELEASE)
[DEBUG]             ch.qos.logback:logback-classic:jar:1.2.3:compile (version managed from 1.2.3)
[DEBUG]                ch.qos.logback:logback-core:jar:1.2.3:compile (version managed from 1.2.3)
[DEBUG]             org.apache.logging.log4j:log4j-to-slf4j:jar:2.11.2:compile (version managed from 2.11.2)
[DEBUG]             org.slf4j:jul-to-slf4j:jar:1.7.28:compile (version managed from 1.7.28)
[DEBUG]          javax.annotation:javax.annotation-api:jar:1.3.2:compile (version managed from 1.3.2)
[DEBUG]          org.yaml:snakeyaml:jar:1.23:runtime (version managed from 1.23)
[DEBUG]       org.thymeleaf:thymeleaf-spring5:jar:3.0.11.RELEASE:compile (version managed from 3.0.11.RELEASE)
[DEBUG]          org.thymeleaf:thymeleaf:jar:3.0.11.RELEASE:compile (version managed from 3.0.11.RELEASE)
[DEBUG]             org.attoparser:attoparser:jar:2.0.5.RELEASE:compile
[DEBUG]             org.unbescape:unbescape:jar:1.1.6.RELEASE:compile
[DEBUG]       org.thymeleaf.extras:thymeleaf-extras-java8time:jar:3.0.4.RELEASE:compile (version managed from 3.0.4.RELEASE)
[DEBUG]    org.springframework.boot:spring-boot-starter-web:jar:2.1.9.RELEASE:compile
[DEBUG]       org.springframework.boot:spring-boot-starter-json:jar:2.1.9.RELEASE:compile (version managed from 2.1.9.RELEASE)
[DEBUG]          com.fasterxml.jackson.core:jackson-databind:jar:2.9.9.3:compile (version managed from 2.9.9.3)
[DEBUG]             com.fasterxml.jackson.core:jackson-annotations:jar:2.9.0:compile (version managed from 2.9.0)
[DEBUG]          com.fasterxml.jackson.datatype:jackson-datatype-jdk8:jar:2.9.9:compile (version managed from 2.9.9)
[DEBUG]          com.fasterxml.jackson.datatype:jackson-datatype-jsr310:jar:2.9.9:compile (version managed from 2.9.9)
[DEBUG]          com.fasterxml.jackson.module:jackson-module-parameter-names:jar:2.9.9:compile (version managed from 2.9.9)
[DEBUG]       org.springframework.boot:spring-boot-starter-tomcat:jar:2.1.9.RELEASE:compile (version managed from 2.1.9.RELEASE)
[DEBUG]          org.apache.tomcat.embed:tomcat-embed-core:jar:9.0.26:compile (version managed from 9.0.26)
[DEBUG]          org.apache.tomcat.embed:tomcat-embed-el:jar:9.0.26:compile (version managed from 9.0.26)
[DEBUG]          org.apache.tomcat.embed:tomcat-embed-websocket:jar:9.0.26:compile (version managed from 9.0.26)
[DEBUG]       org.hibernate.validator:hibernate-validator:jar:6.0.17.Final:compile (version managed from 6.0.17.Final)
[DEBUG]          javax.validation:validation-api:jar:2.0.1.Final:compile (version managed from 2.0.1.Final)
[DEBUG]          org.jboss.logging:jboss-logging:jar:3.3.3.Final:compile (version managed from 3.3.2.Final)
[DEBUG]          com.fasterxml:classmate:jar:1.4.0:compile (version managed from 1.3.4)
[DEBUG]       org.springframework:spring-web:jar:5.1.10.RELEASE:compile (version managed from 5.1.10.RELEASE)
[DEBUG]          org.springframework:spring-beans:jar:5.1.10.RELEASE:compile (version managed from 5.1.10.RELEASE)
[DEBUG]       org.springframework:spring-webmvc:jar:5.1.10.RELEASE:compile (version managed from 5.1.10.RELEASE)
[DEBUG]          org.springframework:spring-aop:jar:5.1.10.RELEASE:compile (version managed from 5.1.10.RELEASE)
[DEBUG]          org.springframework:spring-context:jar:5.1.10.RELEASE:compile (version managed from 5.1.10.RELEASE)
[DEBUG]          org.springframework:spring-expression:jar:5.1.10.RELEASE:compile (version managed from 5.1.10.RELEASE)
[DEBUG]    org.springframework.boot:spring-boot-starter-test:jar:2.1.9.RELEASE:test
[DEBUG]       org.springframework.boot:spring-boot-test:jar:2.1.9.RELEASE:test (version managed from 2.1.9.RELEASE)
[DEBUG]       org.springframework.boot:spring-boot-test-autoconfigure:jar:2.1.9.RELEASE:test (version managed from 2.1.9.RELEASE)
[DEBUG]       com.jayway.jsonpath:json-path:jar:2.4.0:test (version managed from 2.4.0)
[DEBUG]          net.minidev:json-smart:jar:2.3:test
[DEBUG]             net.minidev:accessors-smart:jar:1.2:test
[DEBUG]                org.ow2.asm:asm:jar:5.0.4:test
[DEBUG]       org.assertj:assertj-core:jar:3.11.1:test (version managed from 3.11.1)
[DEBUG]       org.mockito:mockito-core:jar:2.23.4:test (version managed from 2.23.4)
[DEBUG]          net.bytebuddy:byte-buddy:jar:1.9.16:test (version managed from 1.9.3)
[DEBUG]          net.bytebuddy:byte-buddy-agent:jar:1.9.16:test (version managed from 1.9.3)
[DEBUG]          org.objenesis:objenesis:jar:2.6:test
[DEBUG]       org.hamcrest:hamcrest-core:jar:1.3:test (version managed from 1.3)
[DEBUG]       org.hamcrest:hamcrest-library:jar:1.3:test (version managed from 1.3)
[DEBUG]       org.skyscreamer:jsonassert:jar:1.5.0:test (version managed from 1.5.0)
[DEBUG]          com.vaadin.external.google:android-json:jar:0.0.20131108.vaadin1:test
[DEBUG]       org.springframework:spring-core:jar:5.1.10.RELEASE:compile (version managed from 5.1.10.RELEASE)
[DEBUG]          org.springframework:spring-jcl:jar:5.1.10.RELEASE:compile (version managed from 5.1.10.RELEASE)
[DEBUG]       org.springframework:spring-test:jar:5.1.10.RELEASE:test (version managed from 5.1.10.RELEASE)
[DEBUG]       org.xmlunit:xmlunit-core:jar:2.6.3:test (version managed from 2.6.3)
[DEBUG]          javax.xml.bind:jaxb-api:jar:2.3.1:test (version managed from 2.3.0)
[DEBUG]             javax.activation:javax.activation-api:jar:1.2.0:test (version managed from 1.2.0)
[DEBUG]    org.springframework.boot:spring-boot-devtools:jar:2.1.9.RELEASE:compile
[DEBUG]       org.springframework.boot:spring-boot:jar:2.1.9.RELEASE:compile (version managed from 2.1.9.RELEASE)
[DEBUG]       org.springframework.boot:spring-boot-autoconfigure:jar:2.1.9.RELEASE:compile (version managed from 2.1.9.RELEASE)
[DEBUG]    org.python:jython-standalone:jar:2.7.1:compile
[DEBUG]    org.slf4j:slf4j-api:jar:2.0.0-alpha1:compile
[DEBUG]    org.slf4j:slf4j-log4j12:jar:1.8.0-beta2:compile
[DEBUG]       log4j:log4j:jar:1.2.17:compile
[DEBUG]    org.apache.logging.log4j:log4j-core:jar:2.11.2:compile
[DEBUG]       org.apache.logging.log4j:log4j-api:jar:2.11.2:compile (version managed from 2.11.2)
[DEBUG]    com.fasterxml.jackson.core:jackson-core:jar:2.9.9:compile
[DEBUG]    junit:junit:jar:4.12:test
[INFO] 
[INFO] --- exec-maven-plugin:1.6.0:java (default-cli) @ interpreter ---
[DEBUG] Dependency collection stats: {ConflictMarker.analyzeTime=456545, ConflictMarker.markTime=236598, ConflictMarker.nodeCount=93, ConflictIdSorter.graphTime=254409, ConflictIdSorter.topsortTime=63887, ConflictIdSorter.conflictIdCount=39, ConflictIdSorter.conflictIdCycleCount=0, ConflictResolver.totalTime=1867595, ConflictResolver.conflictItemCount=78, DefaultDependencyCollector.collectTime=217481272, DefaultDependencyCollector.transformTime=3103722}
[DEBUG] org.codehaus.mojo:exec-maven-plugin:jar:1.6.0
[DEBUG]    org.apache.maven:maven-toolchain:jar:2.2.1:compile
[DEBUG]    org.apache.maven:maven-project:jar:2.2.1:compile
[DEBUG]       org.apache.maven:maven-settings:jar:2.2.1:compile
[DEBUG]       org.apache.maven:maven-profile:jar:2.2.1:compile
[DEBUG]       org.apache.maven:maven-plugin-registry:jar:2.2.1:compile
[DEBUG]       org.codehaus.plexus:plexus-interpolation:jar:1.11:compile
[DEBUG]       org.codehaus.plexus:plexus-container-default:jar:1.0-alpha-9-stable-1:compile
[DEBUG]          junit:junit:jar:4.12:test (scope managed from default) (version managed from default)
[DEBUG]             org.hamcrest:hamcrest-core:jar:1.3:test
[DEBUG]    org.apache.maven:maven-model:jar:2.2.1:compile
[DEBUG]    org.apache.maven:maven-artifact:jar:2.2.1:compile
[DEBUG]    org.apache.maven:maven-artifact-manager:jar:2.2.1:compile
[DEBUG]       org.apache.maven:maven-repository-metadata:jar:2.2.1:compile
[DEBUG]       backport-util-concurrent:backport-util-concurrent:jar:3.1:compile
[DEBUG]    org.apache.maven:maven-core:jar:2.2.1:compile
[DEBUG]       org.apache.maven:maven-plugin-parameter-documenter:jar:2.2.1:compile
[DEBUG]       org.slf4j:slf4j-jdk14:jar:1.5.6:runtime
[DEBUG]          org.slf4j:slf4j-api:jar:1.5.6:runtime
[DEBUG]       org.slf4j:jcl-over-slf4j:jar:1.5.6:runtime
[DEBUG]       org.apache.maven.reporting:maven-reporting-api:jar:2.2.1:compile
[DEBUG]          org.apache.maven.doxia:doxia-sink-api:jar:1.1:compile
[DEBUG]          org.apache.maven.doxia:doxia-logging-api:jar:1.1:compile
[DEBUG]       org.apache.maven:maven-error-diagnostics:jar:2.2.1:compile
[DEBUG]       commons-cli:commons-cli:jar:1.2:compile
[DEBUG]       org.apache.maven:maven-plugin-descriptor:jar:2.2.1:compile
[DEBUG]       org.codehaus.plexus:plexus-interactivity-api:jar:1.0-alpha-4:compile
[DEBUG]       org.apache.maven:maven-monitor:jar:2.2.1:compile
[DEBUG]       classworlds:classworlds:jar:1.1:compile
[DEBUG]       org.sonatype.plexus:plexus-sec-dispatcher:jar:1.3:compile
[DEBUG]          org.sonatype.plexus:plexus-cipher:jar:1.4:compile
[DEBUG]    org.apache.maven:maven-plugin-api:jar:2.2.1:compile
[DEBUG]    org.codehaus.plexus:plexus-utils:jar:3.0.20:compile
[DEBUG]    org.apache.commons:commons-exec:jar:1.3:compile
[DEBUG] Created new class realm plugin>org.codehaus.mojo:exec-maven-plugin:1.6.0
[DEBUG] Importing foreign packages into class realm plugin>org.codehaus.mojo:exec-maven-plugin:1.6.0
[DEBUG]   Imported:  < maven.api
[DEBUG] Populating class realm plugin>org.codehaus.mojo:exec-maven-plugin:1.6.0
[DEBUG]   Included: org.codehaus.mojo:exec-maven-plugin:jar:1.6.0
[DEBUG]   Included: org.codehaus.plexus:plexus-interpolation:jar:1.11
[DEBUG]   Included: backport-util-concurrent:backport-util-concurrent:jar:3.1
[DEBUG]   Included: org.slf4j:slf4j-jdk14:jar:1.5.6
[DEBUG]   Included: org.slf4j:jcl-over-slf4j:jar:1.5.6
[DEBUG]   Included: org.apache.maven.reporting:maven-reporting-api:jar:2.2.1
[DEBUG]   Included: org.apache.maven.doxia:doxia-sink-api:jar:1.1
[DEBUG]   Included: org.apache.maven.doxia:doxia-logging-api:jar:1.1
[DEBUG]   Included: commons-cli:commons-cli:jar:1.2
[DEBUG]   Included: org.codehaus.plexus:plexus-interactivity-api:jar:1.0-alpha-4
[DEBUG]   Included: org.sonatype.plexus:plexus-sec-dispatcher:jar:1.3
[DEBUG]   Included: org.sonatype.plexus:plexus-cipher:jar:1.4
[DEBUG]   Included: org.codehaus.plexus:plexus-utils:jar:3.0.20
[DEBUG]   Included: org.apache.commons:commons-exec:jar:1.3
[DEBUG] Configuring mojo org.codehaus.mojo:exec-maven-plugin:1.6.0:java from plugin realm ClassRealm[plugin>org.codehaus.mojo:exec-maven-plugin:1.6.0, parent: jdk.internal.loader.ClassLoaders$AppClassLoader@799f7e29]
[DEBUG] Configuring mojo 'org.codehaus.mojo:exec-maven-plugin:1.6.0:java' with basic configurator -->
[DEBUG]   (f) addOutputToClasspath = true
[DEBUG]   (f) addResourcesToClasspath = false
[DEBUG]   (f) arguments = []
[DEBUG]   (f) classpathScope = runtime
[DEBUG]   (f) cleanupDaemonThreads = true
[DEBUG]   (f) daemonThreadJoinTimeout = 15000
[DEBUG]   (f) includePluginDependencies = false
[DEBUG]   (f) includeProjectDependencies = true
[DEBUG]   (f) keepAlive = false
[DEBUG]   (f) killAfter = -1
[DEBUG]   (f) localRepository =       id: local
      url: file:///Users/leaddev/.m2/repository/
   layout: default
snapshots: [enabled => true, update => always]
 releases: [enabled => true, update => always]

[DEBUG]   (f) mainClass = com.nejeoui.interpreter.InterpreterApplication
[DEBUG]   (f) pluginDependencies = [org.codehaus.mojo:exec-maven-plugin:maven-plugin:1.6.0:, org.apache.maven:maven-toolchain:jar:2.2.1:compile, org.apache.maven:maven-project:jar:2.2.1:compile, org.apache.maven:maven-settings:jar:2.2.1:compile, org.apache.maven:maven-profile:jar:2.2.1:compile, org.apache.maven:maven-plugin-registry:jar:2.2.1:compile, org.codehaus.plexus:plexus-interpolation:jar:1.11:compile, org.codehaus.plexus:plexus-container-default:jar:1.0-alpha-9-stable-1:compile, org.apache.maven:maven-model:jar:2.2.1:compile, org.apache.maven:maven-artifact:jar:2.2.1:compile, org.apache.maven:maven-artifact-manager:jar:2.2.1:compile, org.apache.maven:maven-repository-metadata:jar:2.2.1:compile, backport-util-concurrent:backport-util-concurrent:jar:3.1:compile, org.apache.maven:maven-core:jar:2.2.1:compile, org.apache.maven:maven-plugin-parameter-documenter:jar:2.2.1:compile, org.slf4j:slf4j-jdk14:jar:1.5.6:runtime, org.slf4j:slf4j-api:jar:1.5.6:runtime, org.slf4j:jcl-over-slf4j:jar:1.5.6:runtime, org.apache.maven.reporting:maven-reporting-api:jar:2.2.1:compile, org.apache.maven.doxia:doxia-sink-api:jar:1.1:compile, org.apache.maven.doxia:doxia-logging-api:jar:1.1:compile, org.apache.maven:maven-error-diagnostics:jar:2.2.1:compile, commons-cli:commons-cli:jar:1.2:compile, org.apache.maven:maven-plugin-descriptor:jar:2.2.1:compile, org.codehaus.plexus:plexus-interactivity-api:jar:1.0-alpha-4:compile, org.apache.maven:maven-monitor:jar:2.2.1:compile, classworlds:classworlds:jar:1.1:compile, org.sonatype.plexus:plexus-sec-dispatcher:jar:1.3:compile, org.sonatype.plexus:plexus-cipher:jar:1.4:compile, org.apache.maven:maven-plugin-api:jar:2.2.1:compile, org.codehaus.plexus:plexus-utils:jar:3.0.20:compile, org.apache.commons:commons-exec:jar:1.3:compile]
[DEBUG]   (f) project = MavenProject: com.nejeoui:interpreter:1.0.0-SNAPSHOT @ /Users/leaddev/eclipse-workspace/interpreter/pom.xml
[DEBUG]   (f) remoteRepositories = [      id: central
      url: https://repo.maven.apache.org/maven2
   layout: default
snapshots: [enabled => false, update => daily]
 releases: [enabled => true, update => daily]
]
[DEBUG]   (f) skip = false
[DEBUG]   (f) stopUnresponsiveDaemonThreads = false
[DEBUG] -- end configuration --
[DEBUG] Invoking : com.nejeoui.interpreter.InterpreterApplication.main()
[DEBUG] Plugin Dependencies will be excluded.
[DEBUG] Project Dependencies will be included.
[DEBUG] Collected project artifacts [org.springframework.boot:spring-boot-starter-thymeleaf:jar:2.1.9.RELEASE:compile, org.springframework.boot:spring-boot-starter:jar:2.1.9.RELEASE:compile, org.springframework.boot:spring-boot-starter-logging:jar:2.1.9.RELEASE:compile, ch.qos.logback:logback-classic:jar:1.2.3:compile, ch.qos.logback:logback-core:jar:1.2.3:compile, org.apache.logging.log4j:log4j-to-slf4j:jar:2.11.2:compile, org.slf4j:jul-to-slf4j:jar:1.7.28:compile, javax.annotation:javax.annotation-api:jar:1.3.2:compile, org.yaml:snakeyaml:jar:1.23:runtime, org.thymeleaf:thymeleaf-spring5:jar:3.0.11.RELEASE:compile, org.thymeleaf:thymeleaf:jar:3.0.11.RELEASE:compile, org.attoparser:attoparser:jar:2.0.5.RELEASE:compile, org.unbescape:unbescape:jar:1.1.6.RELEASE:compile, org.thymeleaf.extras:thymeleaf-extras-java8time:jar:3.0.4.RELEASE:compile, org.springframework.boot:spring-boot-starter-web:jar:2.1.9.RELEASE:compile, org.springframework.boot:spring-boot-starter-json:jar:2.1.9.RELEASE:compile, com.fasterxml.jackson.core:jackson-databind:jar:2.9.9.3:compile, com.fasterxml.jackson.core:jackson-annotations:jar:2.9.0:compile, com.fasterxml.jackson.datatype:jackson-datatype-jdk8:jar:2.9.9:compile, com.fasterxml.jackson.datatype:jackson-datatype-jsr310:jar:2.9.9:compile, com.fasterxml.jackson.module:jackson-module-parameter-names:jar:2.9.9:compile, org.springframework.boot:spring-boot-starter-tomcat:jar:2.1.9.RELEASE:compile, org.apache.tomcat.embed:tomcat-embed-core:jar:9.0.26:compile, org.apache.tomcat.embed:tomcat-embed-el:jar:9.0.26:compile, org.apache.tomcat.embed:tomcat-embed-websocket:jar:9.0.26:compile, org.hibernate.validator:hibernate-validator:jar:6.0.17.Final:compile, javax.validation:validation-api:jar:2.0.1.Final:compile, org.jboss.logging:jboss-logging:jar:3.3.3.Final:compile, com.fasterxml:classmate:jar:1.4.0:compile, org.springframework:spring-web:jar:5.1.10.RELEASE:compile, org.springframework:spring-beans:jar:5.1.10.RELEASE:compile, org.springframework:spring-webmvc:jar:5.1.10.RELEASE:compile, org.springframework:spring-aop:jar:5.1.10.RELEASE:compile, org.springframework:spring-context:jar:5.1.10.RELEASE:compile, org.springframework:spring-expression:jar:5.1.10.RELEASE:compile, org.springframework:spring-core:jar:5.1.10.RELEASE:compile, org.springframework:spring-jcl:jar:5.1.10.RELEASE:compile, org.springframework.boot:spring-boot-devtools:jar:2.1.9.RELEASE:compile, org.springframework.boot:spring-boot:jar:2.1.9.RELEASE:compile, org.springframework.boot:spring-boot-autoconfigure:jar:2.1.9.RELEASE:compile, org.python:jython-standalone:jar:2.7.1:compile, org.slf4j:slf4j-api:jar:2.0.0-alpha1:compile, org.slf4j:slf4j-log4j12:jar:1.8.0-beta2:compile, log4j:log4j:jar:1.2.17:compile, org.apache.logging.log4j:log4j-core:jar:2.11.2:compile, org.apache.logging.log4j:log4j-api:jar:2.11.2:compile, com.fasterxml.jackson.core:jackson-core:jar:2.9.9:compile]
[DEBUG] Collected project classpath [/Users/leaddev/eclipse-workspace/interpreter/target/classes]
[DEBUG] Adding to classpath : file:/Users/leaddev/eclipse-workspace/interpreter/target/classes/
[DEBUG] Adding project dependency artifact: spring-boot-starter-thymeleaf to classpath
[DEBUG] Adding project dependency artifact: spring-boot-starter to classpath
[DEBUG] Adding project dependency artifact: spring-boot-starter-logging to classpath
[DEBUG] Adding project dependency artifact: logback-classic to classpath
[DEBUG] Adding project dependency artifact: logback-core to classpath
[DEBUG] Adding project dependency artifact: log4j-to-slf4j to classpath
[DEBUG] Adding project dependency artifact: jul-to-slf4j to classpath
[DEBUG] Adding project dependency artifact: javax.annotation-api to classpath
[DEBUG] Adding project dependency artifact: snakeyaml to classpath
[DEBUG] Adding project dependency artifact: thymeleaf-spring5 to classpath
[DEBUG] Adding project dependency artifact: thymeleaf to classpath
[DEBUG] Adding project dependency artifact: attoparser to classpath
[DEBUG] Adding project dependency artifact: unbescape to classpath
[DEBUG] Adding project dependency artifact: thymeleaf-extras-java8time to classpath
[DEBUG] Adding project dependency artifact: spring-boot-starter-web to classpath
[DEBUG] Adding project dependency artifact: spring-boot-starter-json to classpath
[DEBUG] Adding project dependency artifact: jackson-databind to classpath
[DEBUG] Adding project dependency artifact: jackson-annotations to classpath
[DEBUG] Adding project dependency artifact: jackson-datatype-jdk8 to classpath
[DEBUG] Adding project dependency artifact: jackson-datatype-jsr310 to classpath
[DEBUG] Adding project dependency artifact: jackson-module-parameter-names to classpath
[DEBUG] Adding project dependency artifact: spring-boot-starter-tomcat to classpath
[DEBUG] Adding project dependency artifact: tomcat-embed-core to classpath
[DEBUG] Adding project dependency artifact: tomcat-embed-el to classpath
[DEBUG] Adding project dependency artifact: tomcat-embed-websocket to classpath
[DEBUG] Adding project dependency artifact: hibernate-validator to classpath
[DEBUG] Adding project dependency artifact: validation-api to classpath
[DEBUG] Adding project dependency artifact: jboss-logging to classpath
[DEBUG] Adding project dependency artifact: classmate to classpath
[DEBUG] Adding project dependency artifact: spring-web to classpath
[DEBUG] Adding project dependency artifact: spring-beans to classpath
[DEBUG] Adding project dependency artifact: spring-webmvc to classpath
[DEBUG] Adding project dependency artifact: spring-aop to classpath
[DEBUG] Adding project dependency artifact: spring-context to classpath
[DEBUG] Adding project dependency artifact: spring-expression to classpath
[DEBUG] Adding project dependency artifact: spring-core to classpath
[DEBUG] Adding project dependency artifact: spring-jcl to classpath
[DEBUG] Adding project dependency artifact: spring-boot-devtools to classpath
[DEBUG] Adding project dependency artifact: spring-boot to classpath
[DEBUG] Adding project dependency artifact: spring-boot-autoconfigure to classpath
[DEBUG] Adding project dependency artifact: jython-standalone to classpath
[DEBUG] Adding project dependency artifact: slf4j-api to classpath
[DEBUG] Adding project dependency artifact: slf4j-log4j12 to classpath
[DEBUG] Adding project dependency artifact: log4j to classpath
[DEBUG] Adding project dependency artifact: log4j-core to classpath
[DEBUG] Adding project dependency artifact: log4j-api to classpath
[DEBUG] Adding project dependency artifact: jackson-core to classpath
[DEBUG] joining on thread Thread[com.nejeoui.interpreter.InterpreterApplication.main(),5,com.nejeoui.interpreter.InterpreterApplication]
[DEBUG] Setting accessibility to true in order to invoke main().
log4j:WARN No appenders could be found for logger (org.springframework.web.context.support.StandardServletEnvironment).
log4j:WARN Please initialize the log4j system properly.
log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.1.9.RELEASE)

[DEBUG] joining on thread Thread[Catalina-utility-1,1,com.nejeoui.interpreter.InterpreterApplication]