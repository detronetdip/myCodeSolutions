/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums: number[], target: number): number[] {
  let map = new Map();
  let res: number[] = [];
  for (let i = 0; i < nums.length; i++) {
    let rem = target - nums[i];
    if (map.get(rem) != null) {
      res[0] = i;
      res[1] = map.get(rem);
    } else {
      map.set(nums[i], i);
    }
  }
  return res;
};
