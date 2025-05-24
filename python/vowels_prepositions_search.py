paragraph = input("Enter a paragraph: ").lower()
terms = ['a', 'e', 'i', 'o', 'u',
                'in', 'on', 'at', 'by', 'for', 'with', 'about', 'against', 'between', 
                'into', 'through', 'during', 'before', 'after', 'above', 'below', 
                'to', 'from', 'up', 'down', 'off', 'over', 'under', 
                'again', 'further', 'then', 'once', 'is', 'of', 'the', 'and']
for term in terms:
    count = paragraph.count(term)
    print(f"'{term}' occurs {count} time(s)")
