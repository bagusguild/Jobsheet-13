public class BinaryTree {

    Node root;

    public BinaryTree() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) { //Kondisi dimana jika Tree kosong, maka data awal = root
            root = new Node(data);
        } else {
            Node current = root;
            while (true) { //Menggambarkan posisi sekarang (current berfungsi untuk menemukan lokasi yg tepat)
                if (data < current.data) {//jika data kurang dr posisi saat ini (root) maka
                    if (current.left != null) {//jika leftchild tidak kosong, gantikan data saat ini untuk menjadi left child data sebelumnya
                        current = current.left;
                    } else {//namun jika null, maka instansiasi untuk menambakan leftchild pada leaf sebelumnya
                        current.left = new Node(data);
                        break;
                    }
                } else if (data > current.data) {//sama dengan diatas, namun yng ini jika lebih besar dari posisi saat ini (root)
                    if (current.right != null) {//jika right child tidak null
                        current = current.right;//jadikan data saat ini sebagai right child dari data sebeleumnya
                    } else {
                        current.right = new Node(data);//namun jika null, maka instansiasi untuk menambakan rightchild pada leaf sebelumnya
                        break;
                    }
                }else{
                    break;
                }
            }
        }
    }

    boolean find(int data){
        boolean hasil = false;
        Node current = root;
        while (current!=null) {
            if (current.data==data) {
                hasil = true;
                break;
            }else if(data<current.data){
                current = current.left;
            }else{
                current = current.right;
            }
        }return hasil;
    }

    void traversePreOrder(Node node){
        if(node != null){
            System.out.println(" "+node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node node){
        if(node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.println(" "+node.data);
        }
    }

    void traverseInOrder(Node node){
        if(node != null){
            traverseInOrder(node.left);
            System.out.println(" "+node.data);
            traverseInOrder(node.right);
        }
    }

    Node getSuccessor(Node del){
        Node successor = del.right;
        Node successorParent = del;
        while (successor.left!=null) {
            successorParent = successor;
            successor = successor.left;
        }if (successor!=del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }return successor;
    }

    void delete(int data){
        if (isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while(current!=null){
            if(current.data==data){
                break;
            }else if(data<current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if(data>current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        //deletion
        if(current==null){
            System.out.println("Couldn't find data !");
            return;
        }else{
            //if there is no child, simply delete it
            if(current.left==null&&current.right==null){
                if(current==root){
                    root = null;
                }else{
                    if(isLeftChild){
                        parent.left=null;
                    }else{
                        parent.right = null;
                    }
                }
            }else if(current.left==null){//if there is 1 child (right)
                if(current==root){
                    root = current.right;
                }else{
                    if (isLeftChild) {
                        parent.left = current.right;
                    }else{
                        parent.right = current.right;
                    }
                }
            }else if(current.left==null){//if there is 1 child (left)
                if(current==root){
                    root = current.left;
                }else{
                    if (isLeftChild) {
                        parent.left = current.left;
                    }else{
                        parent.right = current.left;
                    }
                }
            }else{
                Node sucessor = getSuccessor(current);
                if(current == root){
                    root = sucessor;
                }else{
                    if (isLeftChild) {
                        parent.left = sucessor;
                    }else{
                        parent.right = sucessor;
                    }sucessor.left = current.left;
                }
            }
        }
    }

    void recursion(int key){
        root = recursion(root, key);
    }
    public Node recursion(Node current, int data){
        if(current == null){
            return new Node(data);
        }if (data < current.data){
            current.left = recursion (current.left, data);
        }else if (data > current.data){
            current.right = recursion(current.right, data);
        }else{
            return current;
        }
        return current;
    }

    void max(){
        Node current = root;
        while(current.right != null){
            current = current.right;
        }
        System.out.println(current.data);
    }
    void min(){
        Node current = root;
        while(current.left != null){
            current = current.left;
        }
        System.out.println(current.data);
    }

    void printleft(Node root){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            System.out.print(" " + root.data);
            return;
        }
        if(root.left != null){
            printleft(root.left);
        }
        if(root.right != null){
            printleft(root.right);
        }
    }

    int jumlahleft(){
        return jumlahleft(root);
    }
    int jumlahleft(Node node){
        if(node == null){
            return 0;
        }
        if(node.left == null && node.right == null){
            return 1;
        }else{
            return jumlahleft(node.left) + jumlahleft(node.right);
        }
    }
}