/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function (s: string): boolean {
  if (
    s.length == 1 ||
    s.charAt(0) == ")" ||
    s.charAt(0) == "}" ||
    s.charAt(0) == "]"
  )
    return false;
  let stack: string[] = [];
  let map = new Map();
  map.set(")", "(");
  map.set("}", "{");
  map.set("]", "[");
  for (let i = 0; i < s.length; i++) {
    let current = s.charAt(i);
    if (current == ")" || current == "}" || current == "]") {
      if (stack.length == 0) return false;
      let c = stack.pop();
      if (map.get(current) != c) {
        return false;
      }
    } else {
      stack.push(current);
    }
  }
  if (stack.length == 0) {
    return true;
  } else {
    return false;
  }
};
