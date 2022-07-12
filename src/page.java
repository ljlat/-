



public class page {
    private int pageNumber;                     // 页号
    private int blockNumber;                    // 页面号（块号）
    public page(){
        this.pageNumber = 0;
        this.blockNumber = -1;
    }
    public int getPageNumber() {
        return pageNumber;
    }
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
    public int getBlockNumber() {
        return blockNumber;
    }
    public void setBlockNumber(int blockNumber) {
        this.blockNumber = blockNumber;
    }
}
