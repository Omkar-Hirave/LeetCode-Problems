function sortArray(nums) {
    QuickSort(nums, 0, nums.length - 1);
    return nums;
}

function QuickSort(nums, low, high) {
    if (low < high) {
        let partition = findPartition(nums, low, high);
        QuickSort(nums, low, partition - 1);
        QuickSort(nums, partition + 1, high);
    }
}

function findPartition(nums, low, high) {
    let pivot = nums[high];
    let i = low - 1;
    for (let j = low; j < high; j++) { 
        if (nums[j] < pivot) {
            i++;
            swap(nums, i, j);
        }
    }
    swap(nums, i + 1, high);
    return i + 1;
}

function swap(nums, i, j) {
    let temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}
let nums = [5,2,3,1]
console.log(sortArray(nums));