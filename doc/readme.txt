dubbo-dataservice 是数据层
dubbo-provider 是提供者
dubbo-consumer 是消费者(web层)

dongtech 金融网(正在准备)

启动顺序
1.启动zookeeper
2.启动provider
3.启动consumer
4.访问效果
http://localhost:8081/getAllUserList
//返回结果[{"username":"A","password":"123456"},{"username":"B","password":"admin"},{"username":"C","password":"123456"}]

特殊情况:如果发现编译问题
请优先考虑添加dataservice到lib库中(dubbo-consumer引用dataservice,dubbo-provider引用dataservice)
