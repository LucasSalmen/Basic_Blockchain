/*
*   Example of a basic blockchain
*
*   Used only for learning purposes
* */
fun main (args: Array<String>){
    // Initialize blockchain
    val blockchain: Blockchain = Blockchain()

    // Create Genesis Block
    blockchain.createGenesis()

    // Get last block's hash
    var lastHash = blockchain.getLastHash()

    // Create a block to add in blockchain
    val block2 = Block(arrayOf("AAA","BBB","CCC","DDD"),lastHash)

    // Add Block 2 to Blockchain
    blockchain.addNewBlock(block2)

    // Get new latest block's hash
    lastHash = blockchain.getLastHash()
    println("Latest block hash was: $lastHash")

    // Create an invalid Block
    val block3 = Block(arrayOf("AAA","BBB","CCC","DDD"),0)

    // Trying to add Block 3 to Blockchain
    blockchain.addNewBlock(block3)
}