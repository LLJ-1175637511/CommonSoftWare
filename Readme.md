1.更改项目git仓库地址

    git remote set-url origin xxx
    
    使用命令确认地址是否修改成功： 

    git remote -v

2.修改项目名

    优先. 退出项目 修改项目名称 重新打开
    a. settings.gradle文件:修改rootProject.name
    b. 展开 .idea ，打开 .name文件 修改名称 
    c. 修改 项目名.iml 
    d. 修改 modules.xml  

3.常用库

// fresco库依赖 implementation 'com.facebook.fresco:fresco:1.0.1'

// 支持GIF动图 implementation 'com.facebook.fresco:animated-gif:1.0.1'

//glide implementation "org.java-websocket:Java-WebSocket:1.4.0" implementation "org.slf4j:slf4j-log4j12:1.7.21"

//leancloud 云服务 implementation 'cn.leancloud:realtime-android:7.2.3' implementation 'cn.leancloud:storage-android:7.2.3' implementation 'io.reactivex.rxjava2:rxandroid:2.1.1'

//全屏显示 编译时：要在gradle.properties中 加上 android.enableJetifier=true
implementation 'com.github.Ye-Miao:StatusBarUtil:1.7.5'

// 华为扫一扫库 在 settings.gradle（高版本AndroidStudio）或 项目的build.gradle(低版本)的repositories中
// 加上  maven { url 'https://developer.huawei.com/repo/'}
implementation 'com.huawei.hms:scanplus:1.1.1.301'

