/**
 Do not return anything, modify nums1 in-place instead.
 */
function merge(nums1, m, nums2, n) {
  var k = m + n - 1;
  while (m > 0 && n > 0) {
    if (nums1[m - 1] > nums2[n - 1]) {
      nums1[k] = nums1[m - 1];
      m--;
    } else {
      nums1[k] = nums2[n - 1];
      n--;
    }
    k--;
  }
  while (n > 0) {
    nums1[k] = nums2[n - 1];
    n--;
    k--;
  }
}
