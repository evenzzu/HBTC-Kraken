要求：
• 连接hbtc.co交易所的现货depth的深度推送数据拿到每个时刻的买卖盘口数据

• 连接kraken.com交易所的现货depth的深度推送数据拿到每个时刻的买卖盘口数据

• 当描述的跨所套利机会出现时，打印日志描述具体那一刻的场景，提示套利机会出现

• 同时监控BTCUSDT，ETHUSDT两个币对下上述的套利机会并输出日志

项目为springboot框架，利用定时任务调度两个交易所接口，获取数据进行比较，也可通过定义的接口查询BTCUSDT，ETHUSDT两个币套利机会并输出日志
输出的日志：
2021-04-26 16:16:30.089  INFO 11440 --- [   scheduling-1] c.example.hbtc.demo.service.BiteService  : 当前时间：2021-04-26T16:16:30.089
交易平台:api.hbtc.co
BTCUSDT当前价格为：52603.31
2021-04-26 16:16:30.366  INFO 11440 --- [   scheduling-1] c.example.hbtc.demo.service.BiteService  : 当前时间：2021-04-26T16:16:30.366
交易平台:api.kraken.com
BTCUSDT当前价格为：52659.300
2021-04-26 16:16:35.410  INFO 11440 --- [   scheduling-1] c.example.hbtc.demo.service.BiteService  : 当前时间：2021-04-26T16:16:35.410
交易平台:api.hbtc.co
ETHUSDT当前价格为：2436.48
2021-04-26 16:16:35.625  INFO 11440 --- [   scheduling-1] c.example.hbtc.demo.service.BiteService  : 当前时间：2021-04-26T16:16:35.625
交易平台:api.kraken.com
ETHUSDT当前价格为：2434.1900
2021-04-26 16:16:35.625  INFO 11440 --- [   scheduling-1] c.example.hbtc.demo.service.BiteService  : ===========================
2021-04-26 16:16:35.625  INFO 11440 --- [   scheduling-1] c.example.hbtc.demo.service.BiteService  : 当前时间：2021-04-26T16:16:35.625货币ETHUSDT在交易所hbtc.co交易价格较高，价格为：2436.48
2021-04-26 16:16:35.625  INFO 11440 --- [   scheduling-1] c.example.hbtc.demo.service.BiteService  : ===========================
