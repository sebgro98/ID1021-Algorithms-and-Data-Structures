public class HeapTree {

    Node root;

    private class Node {
        Integer prio;
        Node left;
        Node right;
        Integer size;

        Node(Integer prio) {
            this.prio = prio;
            this.left = null;
            this.right = null;
            this.size = 1;
        }

        private Integer add(Integer prio) {
            if (prio < this.prio) {
                Integer tmp = this.prio;
                this.prio = prio;
                prio = tmp;
            }
            this.size++;
            if (this.left == null) {
                this.left = new Node(prio);
                return 1;
            } else if (this.right == null) {
                this.right = new Node(prio);
                return 1;
            } else if (this.right.size < this.left.size) {
                return this.right.add(prio) + 1;
            } else {
                return this.left.add(prio) + 1;
            }
        }

        private Node remove() {
            if (this.left == null && this.right == null) {
                return null;
            } else if (this.left == null) {
                return this.right;
            } else if (this.right == null) {
                return this.left;
            } else if (this.left.prio < this.right.prio) {
                this.prio = this.left.prio;
                this.left = this.left.remove();
            } else {

                this.prio = this.right.prio;
                this.right = this.right.remove();
            }
            this.size--;
            return this;
        }

        private Boolean check() {
            Integer prio = this.prio;
            boolean leftCheck = true;
            boolean rightCheck = true;
            if (this.left != null) {
                if (this.left.prio >= prio) {
                    leftCheck = this.left.check();
                }
            } else {
                System.out.println(" No right branch");
                leftCheck = false;
            }
            if (this.right != null) {
                if (this.right.prio >= prio) {
                    rightCheck = this.right.check();
                }
            } else {
                System.out.println(" No left branch");
                rightCheck = false;
            }
            return rightCheck && leftCheck;
        }


        public void print(Integer n) {
            System.out.println(" ".repeat(n) + this.prio + "(" + this.size + ")");
            if (this.left == null && this.right == null) {
                return;
            }
            if (this.left != null) {
                this.left.print(n + 2);
            } else
                System.out.println(" ".repeat(n) + "-----");

            if (this.right != null) {
                this.right.print(n + 2);
            } else {
                System.out.println(" ".repeat(n) + "-----");
            }

        }

    }

    public Integer enqueue(Integer prio) {
        if (root != null) {
            return root.add(prio);
        }
            root = new Node(prio);
            return 0;

    }

    public Integer dequeue() {
        if (root != null) {
            Integer temp = root.prio;
            root = root.remove();
            return temp;
        } else {
            return null;
        }
    }

    public void print() {
        if (root != null) {
            root.print(2);
        } else
            System.out.println("Empty");

    }

    public Boolean check() {
        if (root != null) {
            return root.check();
        } else return false;

    }
}


