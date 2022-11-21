package bridge.model

import bridge.Result

class GameResult {

    private var success : Int = 0


    fun setGameResult(move: Move) {
        when(move) {
            Move.POSSIBLE -> success++
        }
    }

    fun checkGameSuccess(size : Int) : Result {
        if(size == success) return Result.SUCCESS
        return Result.FAIL
    }
}