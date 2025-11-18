import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class NoTeamMemberException extends Exception {
    public NoTeamMemberException() {
        super();
    }
}

class Project {
    private String prjct_nm;
    private List<String> mmbr_lst;

    Project(String prjct_nm) {
        this.prjct_nm = prjct_nm;
        this.mmbr_lst = new ArrayList<>();
    }

    void addMember(String mmbr_nm) {
        mmbr_lst.add(mmbr_nm);
    }

    public String toString() {
        return "Project: " + prjct_nm + ", Team Members: " + mmbr_lst;
    }

    boolean hasTeamMembers() throws NoTeamMemberException {
        if (mmbr_lst.size() > 0) {
            return true;
        } else {
            throw new NoTeamMemberException();
        }
    }
}

class ProjectManager {
    public static void updateProjectList(List<Project> prjct_lst) {
        for (Project prjct : prjct_lst) {
            try {
                prjct.hasTeamMembers();
            } catch (NoTeamMemberException e) {
                prjct.addMember("Default Member");
            }
        }
    }

    public static void displayProjectList(List<Project> prjct_lst) {
        System.out.println("Updated project list:");
        for (Project prjct : prjct_lst) {
            System.out.println(prjct);
        }
    }

    public static void main(String[] args) {
        List<Project> prjct_lst = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String prjct_nm = sc.nextLine();
            Project prjct = new Project(prjct_nm);
            prjct_lst.add(prjct);
            int mmbr_size = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < mmbr_size; j++) {
                String mmbr = sc.nextLine();
                prjct.addMember(mmbr);
            }
        }
        sc.close();

        try {
            for (Project prjct : prjct_lst) {
                prjct.hasTeamMembers();
            }
        } catch (NoTeamMemberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        updateProjectList(prjct_lst);
        displayProjectList(prjct_lst);
    }
}
