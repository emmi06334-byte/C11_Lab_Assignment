
package webcontent.classes.library.model;

import java.sql.Date;

public class Book {
    private int id;
    private String title;
    private String author;
    private String referenceId;
    private int issuedTo;
    private Date issueDate;
    private Date submissionDate;

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getReferenceId() { return referenceId; }
    public void setReferenceId(String referenceId) { this.referenceId = referenceId; }

    public int getIssuedTo() { return issuedTo; }
    public void setIssuedTo(int issuedTo) { this.issuedTo = issuedTo; }

    public Date getIssueDate() { return issueDate; }
    public void setIssueDate(Date issueDate) { this.issueDate = issueDate; }

    public Date getSubmissionDate() { return submissionDate; }
    public void setSubmissionDate(Date submissionDate) { this.submissionDate = submissionDate; }
}