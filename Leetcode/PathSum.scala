// LC112 - Scala solution
object Solution {
    def hasPathSum(root: TreeNode, targetSum: Int): Boolean = root match{
        case null => false
        case node if node.left == null && node.right == null => targetSum == root.value
        case _ => hasPathSum(root.left, targetSum - root.value) || hasPathSum(root.right, targetSum - root.value)
    }
}
