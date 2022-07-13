function plusOne(digits: number[]): number[] {
  for (let i = digits.length - 1; i >= 0; i--) {
    if (digits[i] == 9) {
      digits[i] = 0;
    } else {
      digits[i]++;
      return digits;
    }
  }
  var ar = Array(digits.length + 1).fill(0);
  ar[0] = 1;
  return ar;
}
