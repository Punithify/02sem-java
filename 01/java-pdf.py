import argparse
import subprocess

def create_latex_document(java_file, output_tex):
    latex_document = f'''
    \\documentclass{{article}}
    \\usepackage{{listings}}
    \\usepackage{{minted}}
    \\usemintedstyle{{friendly}}
    
    \\begin{{document}}
    
    \\begin{{minted}}{{java}}
    {open(java_file).read()}
    \\end{{minted}}
    
    \\end{{document}}
    '''

    with open(output_tex, 'w') as latex_file:
        latex_file.write(latex_document)

def main():
    parser = argparse.ArgumentParser(description='Convert a Java file to a LaTeX document with syntax highlighting.')
    parser.add_argument('java_file', help='Input Java file')
    parser.add_argument('output_tex', help='Output LaTeX file')

    args = parser.parse_args()
    create_latex_document(args.java_file, args.output_tex)

if __name__ == "__main__":
    main()

