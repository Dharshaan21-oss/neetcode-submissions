class Solution {
        public boolean isPalindrome(String s) {
                int left = 0;
                        int right = s.length() - 1;

                                while (left < right) {
                                            // Move the left pointer forward if the character is not alphanumeric
                                                        while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                                                                        left++;
                                                                                    }
                                                                                                // Move the right pointer backward if the character is not alphanumeric
                                                                                                            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                                                                                                                            right--;
                                                                                                                                        }

                                                                                                                                                    // Compare the characters after converting them to lowercase
                                                                                                                                                                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                                                                                                                                                                                return false;
                                                                                                                                                                                            }

                                                                                                                                                                                                        // Move both pointers inward
                                                                                                                                                                                                                    left++;
                                                                                                                                                                                                                                right--;
                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                return true;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    }

