import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Stack_Buoi1 {
    public static void main(String[] args) {

        // stack = LIFO data structure. Last in first out
        // stores objects into a sort of 'vertical tower'
        // push () to add to the top
        // pop () to remove from the top


        Stack<String> stack = new Stack<>();
        //System.out.println(stack.empty());

        // them 1 phan tu vao stack them vao dau stack
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push(("Borderlands"));
        stack.push("FFVII");

        // stack = [Minecraft, Skyrim, DOOM, Borderlands, FFVII]

        //stack.pop (); -> lay ra phan tu o dau stack

        //String myStack = stack.pop (); -> lay ra phan tu o dau stack va luu tru trong bien myStack

        // stack.pop() -> tra ve phan tu ma no lay ra duoc
        // stack.peek () -> lay ra phan tu o cuoi ma khong xoa phan tu do trong stack.

        // .pop() va .peek() khac nhau:
        // .pop() -> lay ra va xoa phan tu do trong stack
        // .peek() -> lay ra va khong xoa phan tu do trong stack.

        // stack.search("Minecraft") -> tra ve vi tri cua phan tu Minecraft trong stack
        // tra ve Minecraft dang o vi tri thu 5

        // thu tim kiem phan tu khong co trong stack
        // stack.search("Ngan") ket qua tra ra -1

        // sử dụng stack trong những trường hợp nào?
        // 1. tính năng hoàn tác, quay lui
        // 2. Di chuyển tiến / lùi
        // 3. Thuật toán quay lui (mê cung, thư mục, tập tin)
        // 4. Gọi các hàm (ngăn xếp cuộc gọi)



        System.out.println(stack);
    }
}