import java.util.Arrays

class Blockchain {
    var blockchain: Array<Block> = arrayOf()

    fun createGenesis (){
        val block: Block = Block(arrayOf(""),0)
        blockchain += block
    }

    fun createGenesis (transactions: Array<String>){
        val block: Block = Block(transactions,0)
        blockchain += block
    }

    fun addNewBlock (block: Block){
        if (block.previousHash == blockchain.last().hashCode()) {
            blockchain += block
            println("Block Added with these contents: \"" + Arrays.toString(blockchain.last().transactions) + "\" and hash is " + blockchain.last().hashCode())
        }
        else
            println("New block's previous hash must be the same as the last block's hash.")
    }

    fun getLastHash () = blockchain.last().hashCode()
}