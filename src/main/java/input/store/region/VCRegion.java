package input.store.region;

/**
 * @ClassName Region
 * @Description TODO
 * @Author lqc
 * @Date 2022/8/9 下午10:25
 * @Version 1.0
 */

public class VCRegion {
    /*
    * Trailer (offset of other member)
    * RegionMeta (类）
    * MetaIndex int(每一个RegionMeta的物理地址,按照Key的顺序排列)(大小固定)
    * DataIndex int(每一个KV的物理地址)(大小固定，到达后需要分裂split)
    *
    * MetaSet
    * DataSet   (不分，一直往后累加，不用打乱排序）
    * */
    private byte[] data = null;

}
