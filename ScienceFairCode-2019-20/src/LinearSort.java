import java.util.Arrays;
public class LinearSort {
    public static void main(String[] args) {
        System.out.println("Linear Sort");
        System.out.println();
        int[] integers = new int[]{30, 714, 289, 992, 712, 812, 180, 907, 250, 25, 505, 987, 305, 723, 520, 428, 896, 321, 799, 789, 415, 413, 306, 995, 218, 535, 155, 694, 170, 848, 503, 281, 502, 571, 566, 928, 711, 214, 344, 181, 43, 581, 228, 981, 698, 735, 975, 497, 479, 547, 862, 12, 798, 233, 200, 461, 954, 473, 697, 829, 673, 755, 717, 994, 546, 774, 904, 826, 486, 249, 274, 716, 368, 780, 224, 701, 687, 481, 325, 410, 489, 602, 737, 469, 515, 317, 955, 843, 763, 210, 526, 338, 919, 727, 560, 293, 703, 568, 850, 946, 46, 988, 932, 677, 561, 557, 490, 662, 485, 863, 784, 565, 605, 271, 724, 739, 127, 21, 933, 343, 564, 33, 729, 760, 685, 297, 892, 123, 130, 232, 533, 573, 852, 817, 477, 220, 958, 689, 925, 163, 819, 487, 409, 877, 623, 225, 512, 165, 513, 48, 676, 101, 997, 831, 257, 367, 85, 122, 704, 399, 89, 15, 32, 917, 884, 390, 471, 770, 956, 674, 959, 354, 963, 570, 508, 920, 380, 204, 692, 139, 801, 365, 397, 972, 152, 31, 845, 968, 177, 172, 549, 906, 539, 107, 787, 893, 326, 806, 22, 468, 759, 696, 983, 359, 846, 310, 534, 191, 7, 895, 886, 661, 715, 718, 29, 612, 700, 504, 918, 41, 429, 164, 265, 658, 423, 996, 261, 550, 691, 341, 853, 808, 528, 840, 304, 660, 710, 47, 978, 425, 209, 927, 771, 353, 138, 670, 115, 567, 871, 650, 783, 935, 110, 470, 377, 961, 394, 362, 174, 55, 332, 634, 544, 168, 875, 342, 184, 872, 725, 273, 775, 491, 464, 593, 215, 147, 438, 318, 751, 167, 665, 529, 230, 542, 531, 182, 805, 432, 656, 71, 675, 2, 278, 334, 836, 143, 820, 263, 458, 488, 146, 782, 393, 993, 433, 160, 636, 851, 974, 62, 984, 590, 719, 822, 125, 641, 857, 407, 900, 151, 60, 796, 242, 382, 18, 807, 154, 369, 562, 378, 814, 171, 854, 81, 638, 645, 187, 322, 501, 962, 450, 462, 116, 219, 483, 664, 611, 424, 61, 713, 913, 607, 898, 554, 991, 858, 137, 967, 4, 572, 252, 374, 541, 264, 649, 436, 246, 901, 916, 208, 457, 279, 258, 213, 686, 52, 538, 745, 960, 929, 637, 237, 523, 527, 36, 441, 548, 142, 613, 104, 603, 419, 736, 889, 356, 480, 500, 384, 622, 524, 569, 639, 860, 14, 721, 815, 629, 791, 84, 63, 731, 357, 943, 349, 883, 59, 507, 688, 633, 1, 379, 51, 128, 23, 99, 838, 437, 300, 314, 589, 236, 313, 430, 67, 301, 166, 769, 5, 364, 333, 337, 404, 351, 618, 652, 190, 282, 120, 653, 856, 474, 197, 291, 290, 157, 385, 575, 600, 348, 335, 666, 809, 620, 412, 11, 303, 630, 465, 221, 39, 188, 79, 980, 890, 447, 669, 865, 388, 320, 96, 111, 329, 434, 153, 280, 931, 207, 131, 286, 905, 119, 514, 363, 162, 532, 69, 346, 530, 986, 762};
        System.out.print("Initial Data: ");
        for (int i : integers){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        double start = System.nanoTime();
        linSort(integers);
        double end = System.nanoTime();
        double total = end - start;
        System.out.println();
        System.out.println();
        System.out.println("Time Taken to Sort and Output: " + total / 1000000);
    }
    public static void linSort(int[] nums){
        Arrays.sort(nums);
        System.out.print("Sorted Array: ");
        Arrays.stream(nums).forEach(n -> System.out.print(n + " "));
    }
}
