/**
 *
 * @author paul
 */
public class Percolation {
 private int[][] siteStatus;
 private int count;
//Check the WeightedQuickUnionUF  implemented in this blog.
 private WeightedQuickUnionUF quickunion;
 private int N;
 public Percolation(int N) {
 this.N = N;

 siteStatus = new int[N][N];
 quickunion = new WeightedQuickUnionUF((N*N)+2);
 count = 0;
 for (int i = 0; i &lt; N; i++) {
 for (int j = 0; j &lt; N; j++) {
 //initialise site status as blocked
 siteStatus[i][j] = 1;
 //initialise site ids
 count++;
 if (i == 0) {
 quickunion.union(count, 0);
 } else if (i == N-1) {
 quickunion.union(count, (N*N)+1);
 }
 }
 }
 }

 public void open(int i, int j) {
 int x, y;
 x = i-1;
 y = j-1;
 siteStatus[x][y] = 0;
 for (int a = x-1; a &lt;= x+1; a += 2) {
 if (a &gt;= 0 &amp;&amp; a &lt; N &amp;&amp; y &gt;= 0 &amp;&amp; y &lt; N) {
 if (isOpen(a+1, y+1)) {
 quickunion.union((a*N)+(y+1), (x*N)+j);
 }
 }
 }
 for (int b = y-1; b &lt;= y+1; b += 2) {
 if (x &gt;= 0 &amp;&amp; x &lt; N &amp;&amp; b &gt;= 0 &amp;&amp; b &lt; N) {
 if (isOpen(x+1, b+1)) {
 quickunion.union((x*N)+(b+1), (x*N)+j);
 }
 }
 }

 }

 public boolean isOpen(int i, int j) {
 if (i &gt; 0 &amp;&amp; i &lt;= N &amp;&amp; j &gt; 0 &amp;&amp; j &lt;= N) {
 return siteStatus[i-1][j-1] == 0;
 } else {
 throw new IndexOutOfBoundsException("Values are out of range");
 }
 }

 public boolean isFull(int i, int j) {
 if (i &gt; 0 &amp;&amp; i &lt;= N &amp;&amp; j &gt; 0 &amp;&amp; j &lt;= N) {
 if (quickunion.connected(((i-1)*N) + j, 0)) {
 return siteStatus[i-1][j-1] == 0;
 } else {
 return false;
 }

 } else {
 throw new IndexOutOfBoundsException("Values are out of range");
 }
 }

 public boolean percolates() {
 return quickunion.connected(0, (N*N)+1);
 }
}



/**
 *
 * @author paul
 */

public class PercolationStats {
 private Percolation percolation;
 private double[] threshold;
 private double T;
 private int openSites;

 public PercolationStats(int T, int N) {
 if (N &lt;= 0 || T &lt;= 0) {
 throw new IllegalArgumentException("Value is out of range");
 }
 threshold = new double[T];
 int randx, randy;
 this.T = T;
 for (int i = 0; i &lt; T; i++) {

 percolation = new Percolation(N);
 randx = StdRandom.uniform(1, N+1);
 randy = StdRandom.uniform(1, N+1);
 percolation.open(randx, randy);
 openSites = 1;
 while (!percolation.percolates()) {
 randx = StdRandom.uniform(1, N+1);
 randy = StdRandom.uniform(1, N+1);

 if (!percolation.isOpen(randx, randy)) {
 percolation.open(randx, randy);
 openSites++;
 }
 }

 threshold[i] = ((double) openSites)/(N*N);
 }
 }
 public double mean() {
 return StdStats.mean(threshold);
 }
 public double stddev() {
 return StdStats.stddev(threshold);
 }
 public double confidenceLo() {
 return mean() - (1.96*stddev())/Math.sqrt(T);
 }
 public double confidenceHi() {
 return mean() + (1.96*stddev())/Math.sqrt(T);
 }

 public static void main(String[] args) {
 int T, N;
 T = Integer.parseInt(args[0]);
 N = Integer.parseInt(args[1]);
 PercolationStats percolationStats = new PercolationStats(T, N);

//Instead of StdOut.println() function, you can use your own output format
 StdOut.println("%Java PercolationStats " + T + " " + N);
 StdOut.println("Mean "+percolationStats.mean());
 StdOut.println("stddev " + percolationStats.stddev());
 StdOut.println("95% confidence interval = "+ percolationStats.confidenceLo()
 + ", " + percolationStats.confidenceHi());

 }
}