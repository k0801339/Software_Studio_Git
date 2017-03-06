104062223 鄭凱文 Assignment1

實作過程：
我利用<ArrayList>來儲存input的Pokemon data，<HashMap>來紀錄玩家抓到的Pokemon type與數量，
利用一個永遠為true的while迴圈，每次隨機取出一種pokemon，玩家須輸入"run", "catch", "quit"等reaction，
若輸入非上述指令，怪物則會逃跑，不算任何分數。當輸入"quit"結束遊戲，顯示玩家的總得分，及所抓到的所有type及其數量。

輸入格式：
Pokemon data: 依序輸入 "name", "type", "move"
PS:"type"在這裡可接受"大小寫"輸入，程式裡會一律轉成"小寫"判斷
command: "run", "catch", "quit" or other invalid input

輸出格式：
if input "run":
......
Run away successfully!

if input "catch":
......
You catch [Pokemon's name] !

if input "quit":
----------
You quit the game!
----------
other input:
You type the wrong command! [Pokemon's name] runs away!

遇到的問題：
在比較輸入的command和指令是否相符時，不能利用'=='，而須靠'equals'來解決，是這次寫程式時遇到的最大盲點。
另外，在iterate HashMap時，除了利用 for( keyType key: HashMap.keyset() )外，還學到了 entrySet
這個function的使用方法，則是本次作業的最大收穫。