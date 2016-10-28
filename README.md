PREPARE:
Make sure you have java JDK installe by commands returned properly:
javac -version

Make sure maven is installd correctly by typing
mvn -v

Then open this project in intellij
try run it, I got compile error when I run before any check, tried to fiture out the version of jdk version


Error:Internal error: (java.lang.UnsupportedClassVersionError) org/jetbrains/jps/android/model/impl/JpsAndroidModelSerializerExtension : Unsupported major.minor version 52.0
  java.lang.UnsupportedClassVersionError: org/jetbrains/jps/android/model/impl/JpsAndroidModelSerializerExtension : Unsupported major.minor version 52.0
  	at java.lang.ClassLoader.defineClass1(Native Method)
  	at java.lang.ClassLoader.defineClassCond(ClassLoader.java:632)
  	at java.lang.ClassLoader.defineClass(ClassLoader.java:616)
  	at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:141)
  	at java.net.URLClassLoader.defineClass(URLClassLoader.java:283)
  	at java.net.URLClassLoader.access$000(URLClassLoader.java:58)
  	at java.net.URLClassLoader$1.run(URLClassLoader.java:197)
  	at java.security.AccessController.doPrivileged(Native Method)
  	at java.net.URLClassLoader.findClass(URLClassLoader.java:190)
  	at java.lang.ClassLoader.loadClass(ClassLoader.java:307)
  	at java.lang.ClassLoader.loadClass(ClassLoader.java:248)
  	at java.lang.Class.forName0(Native Method)
  	at java.lang.Class.forName(Class.java:247)
  	at java.util.ServiceLoader$LazyIterator.next(ServiceLoader.java:345)
  	at java.util.ServiceLoader$1.next(ServiceLoader.java:421)
  	at com.intellij.util.containers.ContainerUtilRt.copy(ContainerUtilRt.java:179)
  	at com.intellij.util.containers.ContainerUtilRt.newArrayList(ContainerUtilRt.java:168)
  	at org.jetbrains.jps.plugin.impl.JpsPluginManagerImpl.loadExtensions(JpsPluginManagerImpl.java:18)
  	at org.jetbrains.jps.service.impl.JpsServiceManagerImpl.getExtensions(JpsServiceManagerImpl.java:59)
  	at org.jetbrains.jps.model.serialization.JpsModelSerializerExtension.getExtensions(JpsModelSerializerExtension.java:46)
  	at org.jetbrains.jps.model.serialization.library.JpsSdkTableSerializer.getSdkPropertiesSerializer(JpsSdkTableSerializer.java:208)
  	at org.jetbrains.jps.model.serialization.library.JpsSdkTableSerializer.loadSdk(JpsSdkTableSerializer.java:102)
  	at org.jetbrains.jps.model.serialization.library.JpsSdkTableSerializer.loadSdks(JpsSdkTableSerializer.java:83)
  	at org.jetbrains.jps.model.serialization.JpsGlobalLoader$SdkTableSerializer.loadExtension(JpsGlobalLoader.java:144)
  	at org.jetbrains.jps.model.serialization.JpsGlobalLoader$SdkTableSerializer.loadExtension(JpsGlobalLoader.java:137)
  	at org.jetbrains.jps.model.serialization.JpsLoaderBase.loadComponents(JpsLoaderBase.java:61)
  	at org.jetbrains.jps.model.serialization.JpsGlobalLoader.loadGlobalComponents(JpsGlobalLoader.java:83)
  	at org.jetbrains.jps.model.serialization.JpsGlobalLoader.load(JpsGlobalLoader.java:73)
  	at org.jetbrains.jps.model.serialization.JpsGlobalLoader.loadGlobalSettings(JpsGlobalLoader.java:59)
  	at org.jetbrains.jps.model.serialization.impl.JpsSerializationManagerImpl.loadModel(JpsSerializationManagerImpl.java:38)
  	at org.jetbrains.jps.cmdline.JpsModelLoaderImpl.loadModel(JpsModelLoaderImpl.java:45)
  	at org.jetbrains.jps.cmdline.BuildRunner.load(BuildRunner.java:79)
  	at org.jetbrains.jps.cmdline.BuildSession.runBuild(BuildSession.java:267)
  	at org.jetbrains.jps.cmdline.BuildSession.run(BuildSession.java:125)
  	at org.jetbrains.jps.cmdline.BuildMain$MyMessageHandler$1.run(BuildMain.java:238)
  	at org.jetbrains.jps.service.impl.SharedThreadPoolImpl$1.run(SharedThreadPoolImpl.java:44)
  	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:441)
  	at java.util.concurrent.FutureTask$Sync.innerRun(FutureTask.java:303)
  	at java.util.concurrent.FutureTask.run(FutureTask.java:138)
  	at java.util.concurrent.ThreadPoolExecutor$Worker.runTask(ThreadPoolExecutor.java:886)
  	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:908)
  	at java.lang.Thread.run(Thread.java:662)



  	Still need to figure out the jdk version to support this project (home machine could not get latet jdk an maven working together)