
public class CustomLinkedList {
	private ItemNode rootNode;
	private int listItems = 0;
	
	public CustomLinkedList(Object value) {
		System.out.println("Root node created with value: " + value);
		rootNode = new ItemNode(value);
		listItems++;
	}
	
	public void add(Object value) {
		ItemNode addItem = new ItemNode(value);
		ItemNode currentNode = rootNode;
		
		int comparisionResult = -1;	
		boolean itemEvaluated = false;
		
		while (!itemEvaluated) {
			comparisionResult = currentNode.compareTo(addItem.itemValue);
			if( comparisionResult == 0) {
				System.out.println("Already exists");
				itemEvaluated = true;
			} else if (comparisionResult > 0) {
				// Meaning the currentNode value is greater than the value of node to be added
				System.out.println(value + " added before the currentNode of " + currentNode.itemValue);
				ItemNode bufferNode = currentNode;
				currentNode = addItem;
				currentNode.setNext(bufferNode);
				itemEvaluated = true;
				listItems++;
			} else {
				// Current node value is less than the value of node to be added.
				if(currentNode.next() == null) {
					System.out.println(value + " added after the currentNode of " + currentNode.itemValue);
					currentNode.setNext(addItem);
					itemEvaluated = true;
					listItems++;
				}
				else {
					currentNode = (ItemNode) currentNode.next();
					itemEvaluated = false;	
				}
			}
		}
		
		System.out.println("Number of items in the list: " + listItems);
		
		rootNode = currentNode;
	}

}
