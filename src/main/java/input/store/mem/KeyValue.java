package input.store.mem;

import java.util.Comparator;

public class KeyValue {
    String rowKey;
    ValueNode valueListHead;

    public KeyValue(String rowKey, ValueNode valueListHead) {
        this.rowKey = rowKey;
        this.valueListHead = valueListHead;
    }

    public void insert(String cname, String value, long valueLength,short opsType) {
        ValueNode temp=valueListHead;
        while (true){
            temp=temp.next;
            if (temp==null){
                temp=new ValueNode(cname, value, valueLength,opsType);
                break;
            }
        }
    }

    public class KVComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}
