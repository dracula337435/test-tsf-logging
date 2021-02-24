# 试验tsf日志

## 试验步骤

本地启动的```consul```，新建```key/value```，
```key```为```config/application/data```，
```value```为配置文件内容，例如：
```
logging:
  level: 
    io.dracula.test.tsf.logging.TestController: "info"
```
修改即可修改特定```logger```的级别  

## 原理

```spring-cloud-context```带入了```LoggingRebinder```，
在环境变量发生改变时根据现有```logging.level```重设所有```logger```的```level```。  
```tsf-logger```带入了```TLoggerListener```，
实现对```consul配置```中以```logging.level```为前缀的监听，
当有新配置推送时，额外修改```logger```的```level```。但在```tsf```上和本机上试验发现未生效。