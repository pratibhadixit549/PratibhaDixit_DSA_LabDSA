package dsa.bst;

public class BSTPairFinderTest {

	public static void main(String[] args) {

		BinarySearchTree bst = BSTUtils.sampleBST();

		BSTPairFinder pairFinder = new BSTPairFinder(bst, 120); // Sum found - Match Identified
		// new BSTPairFinder(bst, 129); // Nodes not found

		pairFinder.findPairs();

		// findPairs()

	}
}
