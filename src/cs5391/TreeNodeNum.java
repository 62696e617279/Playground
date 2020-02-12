package cs5391;

public class TreeNodeNum extends TreeNode {
    protected int value;

    public TreeNodeNum(int id, int value) {
        super(id);
        this.setValue(value);
    }

    @Override
    public TreeNodeNum clone() throws CloneNotSupportedException {
        TreeNodeNum clone = (TreeNodeNum) super.clone();
        return null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}